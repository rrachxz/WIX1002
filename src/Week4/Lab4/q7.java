package Week4.Lab4;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  M = 0.0,
                P = 0.0,
                C = 0.0,
                L = 0.0,
                R = 0.0,
                i = 0.0,
        totalInterest = 0.0;
        int N = 0;

        System.out.print("enter principal amout: ");
        P = input.nextDouble();

        System.out.print("enter % intereste: ");
        i = input.nextDouble();

        System.out.print("enter total number of months: ");
        N = input.nextInt();

        System.out.printf("Month%23s%17s%16s%22s%20s\n", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        for (int n = 1; n <= N; n++) {
            M = (P * (i / (12 * 100))) / (1 - Math.pow((1 + (i / (12 * 100))), -N));
            C = M * Math.pow((1 + (i / (12 * 100))), -(1 + N - n));
            L = M - C;
            R = (L / (i / (12 * 100))) - C;
            totalInterest += L;

            System.out.printf("%s %23.2f%17.2f%16.2f%22.2f%20.2f\n", (n < 10) ? n + " " : n, M, C, L, R, totalInterest);
        }
    }
}
