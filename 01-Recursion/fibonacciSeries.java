public class fibonacciSeries {
    public static int fibonacci(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0 || num == 1) {
            return num;
        }
        return fibonacci(num - 2) + fibonacci(num - 1);
    }

    public static void main(String[] args) {
        int result = fibonacci(10);
        if (result == -1) {
            System.out.println("Enter Positive Number");
        } else {
            System.out.println(result);
        }

    }
}
