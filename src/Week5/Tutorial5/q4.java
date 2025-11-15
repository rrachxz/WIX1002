package Week5.Tutorial5;

import java.util.Scanner;

public class q4 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("enter ur sentence: ");
        String[] arr =  input.nextLine().split(" ");

        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals("the")){
                count++;
            }
        }

        System.out.println("there are " + count + " word 'the' in the sentence");
    }

}
