package Week4.Lab4;

public class q6 {
    public static void main(String[] args) {
        int rand = (int)(Math.random()*100000);
        int digitCount = (int)(Math.log10(rand) + 1);
        System.out.printf("number of digits in %d is %d", rand, digitCount);
    }
}
