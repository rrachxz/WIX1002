package Week4.Lab4;

import java.util.Scanner;
import java.time.LocalDate;
import static java.time.Year.isLeap;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 0, d1 = 0;

        System.out.print("Enter year: ");
        year = input.nextInt();

        System.out.print("Enter first day of the year: ");
        d1 = input.nextInt();

        int daysToMay = 31 + (isLeap(year) ? 29 : 28) + 31 + 30;
        int daysToAug = daysToMay + 31 + 30 + 31;

    }
}
