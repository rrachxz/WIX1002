package Week9.Lab7;

import java.io.*;

public class q4 {
    public static void main(String[] args) {
        int chars = 0;
        int words = 0;
        int lines = 0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("src/Week10/files/text.txt"));
            String line;
            while((line = in.readLine()) != null){
                chars += line.length();
                words += line.split(" ").length;
                lines++;
            }

            in.close();

            System.out.println("characters: " + chars);
            System.out.println("words: " + words);
            System.out.println("lines: " + lines);

        } catch (IOException e){
            System.out.println("error with file");
        }
    }
}