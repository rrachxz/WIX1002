package Week2.Lab2;

import java.util.Random;

public class q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 0;
        int max = 10001;
        int a = rand.nextInt(min,max);
        System.out.println("random number=  " +a);
        int sum = 0;
        int remainder = 0;
        while(a != 0){
            remainder = a % 10;
            sum += remainder;
            a = a/10;
        }
        System.out.println("sum= "+sum);
    }
}
