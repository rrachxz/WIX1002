package Week3.Lab3;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0.0, b = 0.0, c = 0.0, d = 0.0, e = 0.0, f = 0.0;

        System.out.print("Simultaneous linear equations consists of 2 equations, ax + by = e and cx + dy = f");

        System.out.println("This is for equation ax + by = e");
        System.out.println("Enter value for a: ");
        a = input.nextDouble();
        System.out.println("Enter value for b: ");
        b = input.nextDouble();
        System.out.println("Enter value for e: ");
        e = input.nextDouble();

        System.out.println("This is for equation c x + dy = f");
        System.out.println("Enter value for c: ");
        c = input.nextDouble();
        System.out.println("Enter value for d: ");
        d = input.nextDouble();
        System.out.println("Enter value for f: ");
        f = input.nextDouble();

        if (((a * d) - (b * c)) == 0){
            System.out.printf("The equation has no equations\n");
        } else  {
            System.out.printf("x is %f.\n", ((e * d) - (b * f)) / ((a * d) - (b * c)));
            System.out.printf("y is %f.\n", ((a * f) - (e * c)) / ((a * d) - (b * c)));
        }

    }
}
