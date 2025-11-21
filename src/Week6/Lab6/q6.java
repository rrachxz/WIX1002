package Week6.Lab6;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        q6 num = new q6();
        num.displayPalindromicPrime(20);
        num.dsiplayEmirp(20);
    }

    private void displayPalindromicPrime(int num) {
        int i = 0, number = 2;
        System.out.println("first 20 palindromic prime numbers: ");
        while (i < num) {
            if (((((int) Math.log10(number) + 1) % 2 == 0) && !(((int) Math.log10(number) + 1) == 2))) {
                number = (int) (number * Math.pow(10, (int) Math.log10(number) + 1));
            }

            if (number == reverse(number) && number != reverse(number) && prime(number)) {
                System.out.print(number + (i < num - 1 ? ", " : "\n"));
            }

            number++;
        }
    }

    private void dsiplayEmirp(int num) {
        int i = 0, number = 13;
        System.out.println("first 20 emirp numbers: ");

        while (i < num) {
            if (prime(number) && number != reverse(number) && prime(reverse(number))){
                System.out.print(number + (i < num - 1 ? ", " : "\n"));
            }
        }
    }

    static int reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        } return  reverse;
    }

    static boolean prime(int num) {
        int prime = 1;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {return false;}
        }
        return true;
    }
}
