// Recursion Interview Question 4
public class decimalToBinary {
    public static int d2b(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 2 + 10 * d2b(num / 2);
    }

    public static void main(String[] args) {
        int result = d2b(13);
        System.out.println(result);
    }
}
