package Week2.Lab2;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int a = sc.nextInt();
        int b = a/(60*60);
        int c = (a % (60*60))/60;
        int d = a - (b*60*60) - (c*60);
        System.out.println(b+ " hours " +c+ " mins " +d+ " seconds ");
    }
}
