package Week2.Lab2;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the water in kg:  ");
        double m = input.nextDouble();
        System.out.print("Enter initial temperature:  ");
        double initialTemp = input.nextDouble();
        System.out.print("Enter final temperature:  ");
        double finalTemp = input.nextDouble();

        double Q = m/1000*((initialTemp-32/1.8) - (finalTemp-32/1.8));
        System.out.printf("The energy needed is: %.2f", Q);
    }
}
