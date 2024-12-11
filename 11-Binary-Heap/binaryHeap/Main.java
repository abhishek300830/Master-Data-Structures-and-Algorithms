package binaryHeap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(10);
        heap.insert(10, "Max");
        heap.insert(5, "Max");
        heap.insert(15, "Max");
        heap.insert(1, "Max");
        heap.levelOrder();

    }
}
