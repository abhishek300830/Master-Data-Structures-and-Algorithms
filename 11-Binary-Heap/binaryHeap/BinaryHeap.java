package binaryHeap;

class BinaryHeap {
    int arr[];
    int sizeofTree;

    public BinaryHeap(int size) {
        arr = new int[size + 1];
        sizeofTree = 0;
        System.out.println("Binary heap is created");
    }

    public boolean isEmpty() {
        if (sizeofTree == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("heap is empty");
            return null;
        } else {
            return arr[1];
        }
    }

    public int sizeofHeap() {
        return sizeofTree;
    }

    public void levelOrder() {
        for (int i = 1; i <= sizeofTree; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    // heapify for insert
    public void heapifyBottomToTop(int index, String heapType) {
        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        if (heapType == "Min") {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        if (heapType == "Max") {
            if (arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomToTop(parent, heapType);
    }

    // insert method
    public void insert(int value, String HeapType) {
        arr[sizeofTree + 1] = value;
        sizeofTree++;
        heapifyBottomToTop(sizeofTree, HeapType);
        System.out.println("Value successfully inserted");
    }
}
