import java.util.Arrays;

public class CreatingArray {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        char arrChar[] = new char[5];
        System.out.println(arr1[0]);
        System.out.println(Arrays.toString(arrChar));
        arr1[0] = 10;
        arr1[2] = 20;
        int[] arr = { 1, 2, 3 };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}