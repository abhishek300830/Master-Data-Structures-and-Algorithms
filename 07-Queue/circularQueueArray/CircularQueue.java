package circularQueueArray;

public class CircularQueue {
    int array[];
    int beginingOfQueue;
    int topOfQueue;
    int size;

    public CircularQueue(int size) {
        array = new int[size];
        this.size = size;
        this.beginingOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("Circular Queue Created Successfully with Size : " + size);
    }

    // isEmpty Method
    public boolean isEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull Method
    public boolean isFull() {
        if (topOfQueue + 1 == beginingOfQueue) {
            return true;
        } else if (beginingOfQueue == 0 && topOfQueue + 1 == size) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue Method
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else if (isEmpty()) {
            beginingOfQueue = 0;
            array[++topOfQueue] = value;
            System.out.println("Value Inserted : " + value);

        } else {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            array[topOfQueue] = value;
            System.out.println("value Inserted : " + value);
        }
    }

    // deQueue Method
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int result = array[beginingOfQueue];
            array[beginingOfQueue] = 0;
            if (beginingOfQueue == topOfQueue) {
                beginingOfQueue = topOfQueue = -1;
            } else if (beginingOfQueue + 1 == size) {
                beginingOfQueue = 0;
            } else {
                beginingOfQueue++;
            }
            return result;
        }
    }

    // Peek Method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return array[beginingOfQueue];
        }
    }

    // delete Method
    public void delete() {
        array = null;
        System.out.println("Queue is deleted Successfully.");
    }
}
