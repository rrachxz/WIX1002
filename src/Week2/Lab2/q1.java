package Week2.Lab2;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0; int y = 0;
        char operator = '+';

        System.out.print("Enter x: ");
        x = input.nextInt();
        System.out.print("enter y: ");
        y = input.nextInt();

        System.out.print("Enter the operand: ");
        operator = input.next().charAt(0);

        System.out.printf("%d %c %d = %d\n", x, operator, y, calculate(x, y, operator));
    }

    static int calculate(int x, int y, char operator) {
        switch (operator) {
            case '+': return x + y;
            case '-': return x - y;
            case '*': return x * y;
            case '/': return x / y;
            case '%': return x % y;
            default: return 0;
        }
    }
}
