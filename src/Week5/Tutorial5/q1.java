package Week5.Tutorial5;

public class q1 {
    static void main(String[] args) {
        //a
        float[] arr=new float[12];

        //b
        char[] array = {'A', 'B', 'C', 'D', 'E'};

        //c
        String[] studentName = new String[100];

        //d
        int[][] integer = new int[6][2];

        //e
        int[][] array1 = {{6, 9}, {2, 5}, {4, 6}};
        displayArray(array1);
        System.out.println("\n");

        //f
        array1[1][1]= 4;
        array1[2][0]= 3;
        array1[2][1]= 7;
        displayArray(array1);
    }

    private static void displayArray(int[][] array1) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
