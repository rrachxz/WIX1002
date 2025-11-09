package Week4.Tutorial4;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        final int num = 10;
        System.out.print("the first " + num + " fibonacci numbers are: ");

        for (int i = 0; i < num; i++)
            System.out.print(fibonacci(i) + "");
    }

    private static int fibonacci(int num) {
        if (num == 1 || num == 0) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
