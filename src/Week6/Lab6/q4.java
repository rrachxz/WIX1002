package Week6.Lab6;

public class q4 {
    public static void main(String[] args) {
        System.out.println(findGCD(24, 8));
        System.out.println(findGCD(200, 65));
    }

    static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }
}
