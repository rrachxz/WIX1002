package Week6.Lab6;

public class q2 {
    public static void main(String[] args) {
        q2 shape = new q2();
        for (int i = 1; i < 5; i++) {
            shape.multiPrint((i + 1), '*');
        }

        System.out.println("  *  ");
        System.out.println(" *** ");
        shape.multiPrint(5, '*');
        System.out.println(" *** ");
        System.out.println("  *  ");
    }

    private void multiPrint(int n, char c) {
        System.out.print(c * n);

    }
}
