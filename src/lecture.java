import java.util.Scanner;

public class lecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;

        do {
            System.out.print("enter a number: ");
            number = input.nextInt();
            sum += number;
            count++;
        } while (number < 10  ||  number > 19);
        System.out.println("Total number is "+ count +" and the sum is" + sum);
    }
}