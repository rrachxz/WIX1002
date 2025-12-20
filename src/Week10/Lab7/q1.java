package Week10.Lab7;

import java.io.*;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        writeFile();

        System.out.println("enter course code: ");
        String code = input.next();
        readFile(code);
    }

    static void writeFile() {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Week10/files/course.dat"))) {
            out.writeUTF("course code,course name");
            out.writeUTF("WXES1116,Programming I");
            out.writeUTF("WXES1115,Data Structure");
            out.writeUTF("WXES1110,Operating System");
            out.writeUTF("WXES1112,Computing Mathematics I");
        } catch (IOException e) {
            System.out.println("error writing file");
        }
    }

    static void readFile(String code){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Week10/files/course.dat"))){
            boolean found = false;
            while(true){
                try {
                    String line = in.readUTF();
                    if (line.substring(0,8).equals(code)){
                        System.out.println(line.substring(9));
                        found = true;
                        break;
                    }
                } catch (EOFException e){
                    break;
                }
            }

            if (!found){
                System.out.println("course not found");
            }

        } catch (IOException e){
            System.out.println("error reading file");
        }
    }
}