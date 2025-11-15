package Week5.Tutorial5;

import java.util.Arrays;
import java.util.Scanner;

public class q6 {
    static void main(String args[]) {
        int random = (int) (Math.random() * 256);
        String binary = Integer.toBinaryString(random);
        System.out.println("Binary String: " + binary);
        String[] array = binary.split("");
        System.out.println("Generated random number= " + random);

        for (String word : array) {
            System.out.println(word);
        }
    }
}
