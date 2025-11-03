package Week2.Lab2;

import java.util.Random;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int min = 10;
        int max = 50;
        int a= r.nextInt(min, max);
        System.out.println("first number: " +a);
        int b= r.nextInt(min, max);
        System.out.println("second number: " +b);
        int c= r.nextInt(min, max);
        System.out.println("third number: " +c);
        int sum= a+b+c;
        System.out.println("sum: " +sum);
        double avg = (a+b+c)/3;
        System.out.println("average: " +avg);
    }
}
