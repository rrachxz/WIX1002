package Week5.Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class q6 {
    static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList<>();
        int rows = 0;

        System.out.print("Enter number of rows: ");
        rows = input.nextInt();

        if  (rows == 1) {
            System.out.print(1);
        } else if  (rows == 2) {
            System.out.print("1 0\n1 1");
        } else {
            System.out.printf("1 %s\n", ("0 ").repeat(rows - 1));
            System.out.printf("1 1 %s\n", ("0 ").repeat(rows - 2));
            temp.add(1);
            temp.add(0);
            temp.add(0);
            temp.add(1);

            for(int i = 2; i < rows; i++) {
                for(int j = 0; j <= rows; j++) {
                    System.out.print(temp.get(j) + temp.get(j + 1) + " ");
                    temp.add(temp.get(j) + temp.get(j + 1));
                }

                System.out.printf("%s\n", ("0 ").repeat(rows - i - 1));
                for (int k = 0; k <= i; k++) {
                    temp.remove(i);
                }

                temp.add(0);
            }
        }
    }
}
