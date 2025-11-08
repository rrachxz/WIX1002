package Week4.Lab4;

public class q8 {
    public static void main(String[] args) {
        int n = 0, ni = 0, num = 2;
        n = (int)(Math.random() * 100) + 1;
        System.out.printf("the first %d prime numbers %s:\n", n, (n > 1) ? "s" : "");

        while(ni < n) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.printf("%3d%s%s", num, (ni == n - 1) ? "" : ", ", ((ni + 1) % 10 == 0) ? "\n" : "");
                ni++;
            }
            num++;
        }
    }
}
