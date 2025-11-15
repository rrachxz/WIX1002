package Week5.Lab5;

import java.util.Scanner;

public class q3 {
    static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int N = 0, sum = 0, temp = 0;
        System.out.print("How many numbers of employee?: ");
        N = input.nextInt();

        System.out.println("|   Mon|   Tue|   Wed|   Thu|   Fri|   Sat|   Sun|        Total Work Hours|");

        for (int i = 1; i <= N; i++) {
            sum = 0;
            System.out.print("employee " + (i < 10 ? " " : " ") + i);

            for (int j = 0; j < 7; j++) {
                temp = (int)(Math.random() * 7 + 1);
                System.out.print(temp + " ");
                sum += temp;
            }

            System.out.print(sum);
        }
    }
}
