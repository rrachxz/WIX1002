package Week6.Tutorial6;

import java.util.Random;

public class q1 {
    public static void main(String[] args) {

    }

    //a. define  a  static  method  that  returns  the  maximum  number  from  3  integer parameters.
    public static void findMax(int a, int b, int c){
        if (a > b && a < c){
            return a;
        } else if (b > a && b < c){
            return b;
        } else {
            return c;
        }
    }

    //b. Define  a  static  method  that  that  determine  whether  the  given  integer  is  a square number.
    public static void square(int input){
        int low = 1;
        int high = input / 2 + 1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if (mid * mid == input){
                return true;
            } else if (mid * mid > input){
                high = mid - 1;
            }  else {
                low = mid + 1;
            }
        } return false;
    }

    //c. Define  a  static  method  that  use  to  compute  combination  function  C(n,k). C(n,k) gives the number of different k-elemen
    public static void combination(int n, int k){
        int combination = factorial(n) / factorial(k) * factorial(n-k);
        return combination;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //d. Define a static method that used to determine whether the parameter is a pentagonal number.
    // A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon. Pn = ½ n(3n -1)
    public static boolean pentagonal(int n){
        int a = 3, b = -1, c = n  * 2;
        double discriminant = b * b - 4 * a * c;

        if  (discriminant < 0) {
            return false;
        }

        else if (discriminant == 0) {
            double root = -b / (2 * a);
            if (allNumber(root) && root > 0){
                return true;
            }
        }

        else {
            double rootA = (-b + Math.sqrt(discriminant)) / (2 * a);
            double rootB = (-b - Math.sqrt(discriminant)) / (2 * a);

            if (allNumber(rootA) && rootA > 0){
                return true;
            }

            if (allNumber(rootB) && rootB > 0){
                return true;
            }
        }
        return false;
    }

    //e. Define a static method that displays the number of letters and the number of digits of a String parameter.
    public static String digitSum(String str){
        int digitNum = 0;

        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                digitNum++;
            }
        }

        System.out.println(str.length() + " number of letters");
        System.out.println(digitNum + " number of digits");
    }

    //f. Define a static void method that generates 10 random numbers within 0 to 100 to the method’s parameter.
    // The random numbers can be accessed by the main method.
    public class q1 {
        public static void main(String[] args) {
            int[] numberList = new int[10];
            generateRandomNumber();
        }

        public static void generateRandomNumber(){
            Random random = new Random();
            for (int i = 0; i < 10; i++){
                randomNumber[i] = random.nextInt(100);
            }
        }
    }

    //g. Define a static method that returns the area and the circumference of a circle given the argument is radius.
    //Area = πr2 and Circumference = 2 πr.
    public static double area(double radius){
        return radius * radius * Math.PI;
    }

    public static double circumference(double radius){
        return 2 * radius * Math.PI;
    }

    //h. Define a static method that generate random number within 0 – 10.
    // The method will return the first random number that generate twice.
    public static int randomGenerator(){
        Random random = new Random();
        int[] numberList = new int[10];

        while (true){
            int randomNumber = random.nextInt(10);
            numberList[randomNumber]++;
            if (numberList[randomNumber] > 1){
                return randomNumber;
            }

        }
    }
}
