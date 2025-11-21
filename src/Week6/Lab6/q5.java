package Week6.Lab6;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        q5 multiplication = new q5();
        multiplication.start();
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0, score = 0, inp = 0;

        do {
            System.out.print("Input negative number to quit: ");
            a = (int)(Math.random() * 12);
            b = (int)(Math.random() * 12);

            System.out.print(a + " x "  + b + " = ");
            input.nextInt();

            if (a * b == inp) {
                score++;
            }
        }
        while (inp >= 0);
        System.out.println("score: " + score);
    }
}
