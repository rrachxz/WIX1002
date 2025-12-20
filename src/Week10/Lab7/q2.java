package Week10.Lab7;

import java.net.URL;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.net.URLConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        try{
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            PrintWriter out = new PrintWriter(new FileOutputStream("src/Week10/files/index.htm"));

            while(in.hasNextLine()){
                String line = in.nextLine();
                out.println(line);
            }

            System.out.println("done writing to index.htm");
            out.close();
        } catch (IOException e){
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}