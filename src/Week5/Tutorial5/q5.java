package Week5.Tutorial5;

import java.util.Scanner;

public class q5 {
    static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter ur sentence: ");
        String sentence = input.nextLine();

        for (int i = 0; i <= sentence.length() - 1; i--) {
            System.out.print(sentence.charAt(i));
        }

        System.out.println("\n");
    }
}
