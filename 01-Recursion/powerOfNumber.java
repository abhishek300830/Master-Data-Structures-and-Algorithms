// Recursion Interview Question 2
public class powerOfNumber {
    int power(int base, int expo) {
        if (expo < 0 || base < 0) {
            return -1;
        }
        if (expo == 1) {
            return base;
        }
        return base * power(base, expo - 1);
    }

    public static void main(String[] args) {
        powerOfNumber obj = new powerOfNumber();
        int result = obj.power(2, 14);
        System.out.println("Power is : " + result);
    }
}
