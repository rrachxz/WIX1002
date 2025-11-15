package Week5.Tutorial5;

public class q2 {
    static void main(String args[]) {

        //a
        String[] code = {"AAA", "AAB", "AAC", "AAD"};

        //b
        int sum = 0;
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++){
            sum += num[i];
        }

        //c
        int[][] t = new int[3][3];
        t[1][2] = 5;

        //d
        int l = 3;
        int[] score = new int[5];
        score[1] = 78;
        score[++l] = 100;
    }
}
