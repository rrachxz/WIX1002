package Week4.Lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int factor = 0, div = 1;

        System.out.print("enter an integer: ");
        factor = input.nextInt();

        while(!list.contains(div)) {
            if (factor % div == 0) {
                System.out.printf("%d, ", div);
                list.add(factor / div);
            }

            div++;
        }

        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + ", ");
        }

        System.out.print("\n");

    }
}
