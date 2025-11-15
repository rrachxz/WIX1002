package Week5.Lab5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class q4 {
    static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String[][] matrix = new String[3][3];

        // Corrected Loop Structure
        for (int i = 2; i >= 0; i--) { // CHANGE 'i++' to 'i--'
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number: ");
                matrix[i][j] = input.nextLine();
            }
        }

        String temp = Arrays.stream(matrix).map(row -> String.join("  ", row))
                .collect(Collectors.joining("\n"));

        System.out.println(temp);
    }
}
