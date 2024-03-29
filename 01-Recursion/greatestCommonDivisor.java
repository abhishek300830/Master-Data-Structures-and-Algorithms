
// Recursion Interview Question 3
public class greatestCommonDivisor {
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int result = gcd(48, 18);
        System.out.println(result);
    }
}
