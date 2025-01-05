public class FirstPatternConstantWindow {
    // find the maximum sum of 4 cosecutive elements 
    public static void main(String[] args) {
        int[] arr = { -1, 2, 3, 3, 4, 5, -1 };
        // constant window
        int window_size = 4;
        // 2 pointers left and right
        int left = 0;
        int right = window_size - 1;
        // variable to store maximum sum
        int maxSum = 0;
        int sum = 0;
        
        // calculate the sum of constant window
        for (int i = 0; i < window_size; i++) {
            sum += arr[i];
        }
        maxSum = sum;

        while (right < arr.length - 1) {
            sum -= arr[left++];
            sum += arr[++right];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("Max Sum is :"+ maxSum);
    }

}
