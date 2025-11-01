package Week3.Lab3;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = 0.0;
        double rate = (x > 1000 ? 0.125 :
                       x > 500 ? 0.1 : x > 100 ? 0.075 : 0.05);

        System.out.print("Enter sale volume: ");
        x = input.nextDouble();

        System.out.printf("The commission is %.2f\n", x * rate);
    }
}
