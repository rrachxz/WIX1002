package Week3.Lab3;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        input.nextLine();

        System.out.print("Enter the operand: ");
        char operand = input.nextLine().charAt(0);

        if (operand == '+') {
            System.out.print(num + num2);
        } else if (operand == '-') {
            System.out.print(num - num2);
        } else if (operand == '*') {
            System.out.print(num * num2);
        } else if (operand == '/') {
            System.out.print(num / num2);
        } else  {
            System.out.println("Invalid input");
        }
    }

}
