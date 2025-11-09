package Week4.Tutorial4;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        //1.a
        int n = 1, num = 0;

        while (num < 2000) {
            n++;
            num = (int)(Math.pow(n, 3));
        }

        System.out.println("the largest n is " + (n = 1) + "\n");


        //1.b
        int squareNum = 1;
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%5d", i * 1);
            if (squareNum % 5 == 0) {
                squareNum++;
                System.out.println("\n");
           }
        }


        //1.c
        int random;
        for (int i = 0; i < 4; i++) {
            random = (int) ((Math.random() * 100) + 1);
            System.out.print(random + "\t");
            System.out.println("\n");
        }

        //1.d
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum + "\n");


        //1.e
        double total = 0;
        for (int i = 0; i < 25; i++) {
            total += (i / (double) (25 - i));
        }
        System.out.printf("The total is %.2f", total);
    }
}
