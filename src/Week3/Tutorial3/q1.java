package Week3.Tutorial3;

import java.util.Scanner;

//write statements for each followings
public class q1 {
    public static void main(String[] args) {
        //a. determine whether 3 x 8= 27
        int a = 3 * 8;
        int x = 27;
        if (a == x){
            System.out.print("3 x 8 equals to 27");
        } else {
            System.out.print("3 x 8 not equals to 27 it's " + a);
        }

        System.out.print("\n");

        //b. determine whether an input is odd, or even
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = input.nextInt();

        if (x % 2 == 0 ){
            System.out.print(x + " is an even number");
        } else  {
            System.out.print(x + " is an odd number");
        }

        System.out.print("\n");

        //c. determine whether a character is a capital letter
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = input2.next().charAt(0);

        if (Character.isUpperCase(inputChar)){
            System.out.print("this is a capital letter");
        } else {
            System.out.print("this is not a capital letter");
        }

        System.out.print("\n");

        //d.display 2 strings in alphabetical order ignoring their case
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str = input3.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input3.nextLine();

        if (str.compareToIgnoreCase(str2) < 0){
            System.out.print("1. " + str + "\n");
            System.out.print("2. " + str2 + "\n");
        } else  {
            System.out.print("1. " + str2 + "\n");
            System.out.print("2. " + str + "\n");
        }

        //e. a switch statement that display sunday, monday, etc if the input 0 -6
        Scanner input4 = new Scanner(System.in);
        System.out.print("Input 0 - 6: ");
        int num = input4.nextInt();

        switch (num){
            case 0:
                System.out.print("Sunday\n");
                break;
                case 1:
                    System.out.print("Monday\n");
                    break;
                    case 2:
                        System.out.print("Tuesday\n");
                        break;
                        case 3:
                        System.out.print("Wednesday\n");
                        break;
                        case 4:
                        System.out.print("Thursday\n");
                        break;
                        case 5:
                            System.out.print("Friday\n");
                            break;
                            case 6:
                                System.out.print("Saturday\n");
                                break;
        }

    }
}
