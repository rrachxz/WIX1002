package Week6.Lab6;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class q6 {
    public static void main(String[] args) {
        q6 num = new q6();
        num.displayPalindromicPrime(20);
        num.dsiplayEmirp(20);
    }

    private void displayPalindromicPrime(int count) {
        int foundCount = 0;
        int number = 2;

        System.out.println("first " + count + " palindromic prime numbers:");
        while (foundCount < count) {
            if (prime(number)) {
                if (number == reverse(number)) {
                    System.out.print(number + (foundCount < count - 1 ? ", " : ""));
                    foundCount++;

                    if (foundCount % 10 == 0) {
                        System.out.println();
                    }
                }
            }
            number++;
        }
    }

    private void dsiplayEmirp(int count) {
        int foundCount = 0;
        int number = 13;

        System.out.println("\nfirst " + count + " emirp numbers:");

        while (foundCount < count) {
            int reversedNum = reverse(number);

            if (prime(number) && (number != reversedNum) && prime(reversedNum)) {
                System.out.print(number + (foundCount < count - 1 ? ", " : ""));
                foundCount++;

                if (foundCount % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        } return  reversed;
    }

    static boolean prime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}