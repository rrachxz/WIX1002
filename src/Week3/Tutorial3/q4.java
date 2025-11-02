package Week3.Tutorial3;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        //if statement to find the biggest number amont three given integers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = sc.nextInt();
        System.out.print("Enter value for m: ");
        int m = sc.nextInt();
        System.out.print("Enter value for k: ");
        int k = sc.nextInt();

        if (n > m && n > k) {
            System.out.println(n + " is the largest number");
        }
        else if (m >= n && m >= k) {
            System.out.println(m + " is the largest number");
        }  else {
            System.out.println(k + " is the largest number");
        }
    }
}
