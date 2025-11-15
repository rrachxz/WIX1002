package Week5.Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int stdNum = 0;
        double sum = 0;

        System.out.print("Enter number of students:  ");
        stdNum = input.nextInt();

        double[] scores = new double[stdNum];
        for (int i = 0; i < stdNum; i++) {
            scores[i] += Math.round(Math.random() * 10000) / 100.0;
            sum += scores[i];

            System.out.printf("Score %d: %.2f\n", (i + 1), scores[i]);
        }

        Arrays.sort(scores);
        System.out.printf("Highest score is %.2f", scores[stdNum - 1]);
        System.out.printf("Lowest score is %.2f", scores[0]);
        System.out.printf("Average score is %.2f", sum / stdNum);
    }
}
