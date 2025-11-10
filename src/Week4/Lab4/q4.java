package Week4.Lab4;

import java.util.Scanner;

public class q4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 0, d1 = 0;

        System.out.print("enter the year: ");
        year = input.nextInt();

        System.out.print("enter the first day of the year: ");
        d1 = input.nextInt();

        int daystoMay = 31 + (isLeap(year) ? 29 : 28) + 31 + 30;
        int daystoAug = daystoMay + 31 + 30 + 31;

        calendar((d1 + daystoMay) % 7, year, "May", 31);
        calendar((d1 + daystoAug) % 7, year, "August", 31);
    }

    static boolean isLeap(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    static void calendar(int dayinWeek, int year, String month, int daysinMonth) {

        System.out.printf("\nCalendar for %s %d\n", month, year);
        System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.println("│ Sun │ Mon │ Tue │ Wed │ Thu │ Fri │ Sat |");
        System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print(("│     ").repeat(dayinWeek));

        for (int i = 1; i <= daysinMonth; i++) {

            System.out.printf("│ %s  ", (i < 10) ? "0" + i : i);
            dayinWeek++;

            if (dayinWeek % 7 == 0) {
                System.out.print("│\n├─────┼─────┼─────┼─────┼─────┼─────┼─────┤\n");
                dayinWeek = 0;
            }
        }

        System.out.print(("│     ").repeat(7 - dayinWeek) + "│\n└─────┴─────┴─────┴─────┴─────┴─────┴─────┘\n");

    }
}