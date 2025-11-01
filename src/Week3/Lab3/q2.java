package Week3.Lab3;

public class q2 {
    public static void main(String[] args) {
        String[] x = {"zero", "one", "two", "three", "four", "five"};
        int random = (int) (Math.random() * 5);

        System.out.printf("%d is %s\n", random, x[random]);
    }
}