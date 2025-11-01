package Week3.Lab3;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = 0.0, x = 0.0, y = 0.0;

        System.out.print("Enter radius: ");
        r = input.nextDouble();

        System.out.print("Enter the x and y coordinates: \n");
        System.out.print("Enter x: ");
        x = input.nextDouble();
        System.out.print("Enter y: ");
        y = input.nextDouble();

        double distance = Math.sqrt((x * x) + (y * y));
        String position = (distance <= r) ? "inside" : "outside";

        System.out.printf("The point is %s the circle. \n", position);
    }
}
