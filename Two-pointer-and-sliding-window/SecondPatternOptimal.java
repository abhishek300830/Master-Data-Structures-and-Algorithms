// return length of Longest subarray whose sum <= 14 

public class SecondPatternOptimal {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 10, 10 };
        int limit = 14;

        int left = 0, right = 0, windowsum = 0, maxlength = 0;

        int leftIndex = 0, rightIndex = 0;

        while (right < arr.length) {

            // Increasing the windowsize
            windowsum += arr[right];

            // Decreasing window size from left
            while (windowsum > limit) {
                windowsum -= arr[left];
                left++;
            }

            // validation of limit
            if (windowsum <= limit) {
                // maxlength = Math.max(maxlength, right - left + 1);
                if (right - left + 1 > maxlength) {
                    leftIndex = left;
                    rightIndex = right;
                    maxlength = right - left + 1;
                }
            }
            right++;
        }

        System.out.println("maxLength:" + maxlength);
        for (int i = leftIndex; i <= rightIndex; i++) {
            System.err.print(arr + " ");
        }

    }
}
