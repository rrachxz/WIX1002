package Week6.Lab6;

public class q1 {
    public static void main(String[] args) {
        q1 cal = new q1();
        for (int i = 1; i <= 20; i++){
            System.out.println(cal.triangularNum(i));
        }
    }

    int triangularNum(int num){
        return (num * (num + 1)) / 2;
    }
}
