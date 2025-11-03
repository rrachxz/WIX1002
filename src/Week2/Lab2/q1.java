package Week2.Lab2;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celcius = (fahrenheit - 32)/1.8;
        System.out.printf("Temperature in Celcius is: %.2f", celcius);
    }
}