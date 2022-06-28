//Recursion Interview Question 1
public class sumOfDigits {
    // sum of digits using Recursion
    public int sumTheNum(int num) {
        if (num < 0) {
            return 0;
        }
        if (num < 10) {
            return num;
        }
        return num % 10 + sumTheNum(num / 10);
    }

    public static void main(String[] args) {
        sumOfDigits obj = new sumOfDigits();
        int result = obj.sumTheNum(111);
        System.out.println("Sum of Number is : " + result);
    }
}
