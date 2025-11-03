package Week2.Lab2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println("car loan mainly payment");
        Scanner input = new Scanner(System.in);
        System.out.print("The car price: ");
        double p = input.nextDouble();
        System.out.print("The down payment: ");
        double d = input.nextDouble();
        System.out.print("Interest rate in % : ");
        double r = input.nextDouble();
        System.out.print("loan duration in year:  ");
        double y = input.nextDouble();

        double m = (p-d)*(1+r*y/100)/(y*12);
        System.out.printf("Monthly payment =%.2f", m);

    }
}
