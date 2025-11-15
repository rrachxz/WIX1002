package Week5.Lab5;

import java.util.ArrayList;

public class q2 {
    static void main(String args[]) {
        ArrayList<Integer> random = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 20);
            while (random.contains(num)){
                num = (int) (Math.random() * 20);
            }

            System.out.printf("%d%s", num, (i == 9) ? "" : ", ");
            random.add(num);
        }
    }
}
