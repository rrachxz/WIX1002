package Week3.Tutorial3;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        //determine whether the leap year
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("The year is a leap year");
        } else  {
            System.out.println("The year is not a leap year");
        }
    }
}
