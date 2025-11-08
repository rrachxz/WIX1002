package Week4.Lab4;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score1 = 0, score2 = 0, roll = 0;
        boolean p1Turn = true;

        while (Math.max(score1, score2) <= 100) {
            roll = (int) (Math.random() * (6 - 1) + 1);
            if (p1Turn) { score1 += roll; } else { score2 += roll; }
            System.out.printf("Player 1 Score: %d, Player 2 Score: %d\n", score1, score2);
            p1Turn = !p1Turn;
        }

        System.out.printf("Player %d won!", score1 > score2 ? 1 : 2);
    }
}
