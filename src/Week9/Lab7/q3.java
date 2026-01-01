package Week9.Lab7;

import java.io.*;

public class q3 {
    static void main(String[] args){
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/Week10/files/words.txt"));
            PrintWriter out = new PrintWriter(new FileOutputStream("src/Week10/files/reverse.txt"));

            String line;
            while((line = in.readLine()) != null){
                String reversed = new StringBuilder(line).reverse().toString();
                out.println(reversed);
            }

            in.close();
            out.close();

            System.out.println("done");

        } catch (IOException e){
            System.out.println("error with file input");
        }
    }
}