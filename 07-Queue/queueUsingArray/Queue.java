package queueUsingArray;

public class Queue {
    int array[];
    int beginningOfQueue;
    int topOfQueue;

    public Queue(int size) {
        this.array = new int[size];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("Queue Created Successfully of size : " + size);
    }

    // isFull Method
    public boolean isFull() {
        if (topOfQueue == array.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    // isEmpty Method
    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == array.length) {
            return true;
        } else {
            return false;
        }
    }

    // enqueue Method
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            array[++topOfQueue] = value;
            System.out.println("Value Inserted Successfully.");

        } else {
            array[++topOfQueue] = value;
            System.out.println("Value Inserted Successfully.");
        }
    }
}
