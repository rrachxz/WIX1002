package Week4.Lab4;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0,
        min = 1000,
        max = 0,
        N = 0,
        xsqrd = 0,
        x = 0;

        System.out.print("enter a score (negative score to quit): ");
        input.nextInt();

        while (n >= 0) {
            min = Math.min(max, n);
            max = Math.max(max, n);
            x += n;
            xsqrd += n * n;
            N++;

            System.out.print("enter a score (negative score to quit): ");
            n = input.nextInt();
        }

        double avg =  (double) x / N;
        double deviation = (double) Math.sqrt((xsqrd - Math.pow(x, 2) / N) / (N - 1));

        System.out.printf("minimum score: %d\n", min);
        System.out.printf("maximum score: %d\n", max);
        System.out.printf("average score: %.2f\n", avg);
        System.out.printf("standard deviation: %.2f\n", deviation);
    }
}
