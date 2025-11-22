package Week6.Tutorial6;

public class q2 {
    public static void main(String[] args) {
        decendingOrder(1, 2, 3);
    }

    private static void decendingOrder(int k, int l, int m) {
        if (k > l && k > m) {
            if (l > m) {
                System.out.println(k + " " + l + " " + m);
            }
            else  {
                System.out.println(k + " " + m + " " + l);
            }
        }

        else if (l > k && l > m) {
            if (k > m) {
                System.out.println(l + " " + k + " " + m);
            }
            else  {
                System.out.println(l + " " + m + " " + k);
            }
        }

        else {
            if (k > l){
                System.out.println(m + " " + k + " " + l);
            } else {
                System.out.println(m + " " + l + " " + k);
            }
        }
    }
}
