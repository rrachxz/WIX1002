package Week3.Lab3;

public class q4 {
    public static void main(String[] args) {
        int player1 = 0, player2 = 0, roll  = 0;

        System.out.print("two player dice game \n");

        for (int i = 1; i < 3; i++) {
            roll = (int)(Math.random() * 5) + 1;
            player1 += roll;
            System.out.printf("Player 1 gets %d in roll %d\n", roll, i);
        }

        for (int i = 1; i < 3; i++) {
            roll = (int)(Math.random() * 5) + 1;
            player2 += roll;
            System.out.printf("Player 2 gets %d in roll %d\n", roll, i);
        }

        int winner = (player1 > player2 ? 1 : 2);
        int highestScore = Math.max(player1, player2);

        if (player1 ==player2){
            System.out.println("draw!\n");
        } else {
            System.out.printf("Player %d wins the game with highest score of %d !\n", winner, highestScore);
        }
    }

}
