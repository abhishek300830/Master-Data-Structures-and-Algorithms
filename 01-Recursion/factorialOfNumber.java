import java.util.Scanner;

public class factorialOfNumber {
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        if (num < 0) {
            return -1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Num to Calculate Factorial : ");
        int num = scan.nextInt();
        scan.close();
        int result = factorial(num);
        if (result == -1) {
            System.out.println("Please Enter Positive Number");
        } else {
            System.out.println("Factorial of " + num + " is " + result);
        }

    }
}