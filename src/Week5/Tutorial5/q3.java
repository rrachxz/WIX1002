package Week5.Tutorial5;

public class q3 {
    static void main(String args[]) {
        int[] marks = new int[5];
        int i = 0, j = 1;
        marks[i] = 12;
        marks[j] = marks[i] + 19;
        marks[j - 1] = marks[j] * marks[j];
        marks[j * 3] = marks[i + 1];
        marks[++j] = marks[i] % 5;
        marks[2 * j] = marks[j - 1];

        for (int k = 0; k < marks.length; k++) {
            System.out.print("marks[" + k + "] = " + marks[k] + "\n");
        }
    }
}
