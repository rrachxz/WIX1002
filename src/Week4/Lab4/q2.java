package Week4.Lab4;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.print("enter number: ");
        n = input.nextInt();

        int result = (int) (Math.pow(3, n) + 3 * Math.pow(2, n) - 2 * n) / 6;
        System.out.println(result);
        System.out.print("\n");

        Scanner input1 = new Scanner(System.in);
        int sum = 0;

        System.out.print("enter an integer: ");
        int num = input1.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                sum += i;
            }
        }

        System.out.print("the sum is " + sum + "\n");
    }
}
