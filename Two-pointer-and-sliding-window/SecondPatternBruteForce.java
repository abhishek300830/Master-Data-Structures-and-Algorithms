import java.util.ArrayList;

public class SecondPatternBruteForce {
    public static void printList(ArrayList<Integer> list){
        for(int x: list){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    // printing all the subarrays 
    public static void main(String[] args) {
        int arr[] =  { -1, 2, 3, 3, 4, 5, -1 };
        
        for(int i = 0; i < arr.length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                list.add(arr[j]);
                printList(list);
            }
        }
    }
}
