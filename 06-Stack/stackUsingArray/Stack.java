package stackUsingArray;
// This Stack is Using Arrays

public class Stack {
    int array[];
    int topOfStack;

    public Stack(int size) {
        this.array = new int[size];
        this.topOfStack = -1;
        System.err.println("The Stack is Creted with size of " + size);
    }

    // isEmpty Method
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull Method
    public boolean isFull() {
        if (topOfStack == array.length - 1) {
            // System.out.println("Stack is Full");
            return true;
        } else {
            return false;
        }
    }

    // push Method
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            array[++topOfStack] = value;
            System.out.println(value + " is Inserted at index : " + topOfStack);

        }
    }

    // pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int topStack = array[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    // peek Method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return array[topOfStack];
        }
    }

    // delete method
    public void deleteStack() {
        array = null;
        topOfStack = -1;
        System.out.println("Stack deleted Successfully");
    }
}
