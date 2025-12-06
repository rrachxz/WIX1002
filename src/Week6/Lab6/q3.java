package Week6.Lab6;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        q3 num = new q3();
        int[] reverse = new int[10];

        System.out.print("Enter 10 integers between spaces: ");
        for (int i = 0; i < 10; i++) {
            reverse[i] = num.reserve(input.nextInt());
            System.out.print(reverse[i] + " ");
        }
    }

    int reserve(int n) {
        int temp = 0;
        while (n > 0) {
            temp = temp * 10 + n % 10;
            n = n / 10;
        }
        return temp;
    }
}
