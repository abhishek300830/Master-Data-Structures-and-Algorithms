package stackAndQueueQuestions;

// Use Single array to implement three stacks
// so if array has 9 spaces =n
// we will divide it in three
// like...
// for stack 1 -[0],[1],[2]  ----[0,n/3)
// for stack 2 -[3],[4],[5]  ----[n/3,2n/3)
// for stack 3 -[6],[7],[8]  ----[2n/3,n)

public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] size;

    public ThreeInOne(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        size = new int[numberOfStacks];
    }

    // isFull Method
    public boolean isFull(int stackNumber) {
        if (size[stackNumber] == stackCapacity) {
            return true;
        } else {
            return false;
        }
    }

    // isEmpty Method
    public boolean isEmpty(int stackNumber) {
        if (size[stackNumber] == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Index of Top
    public int indexOfTop(int stackNumber) {
        int offset = stackNumber * stackCapacity;
        return offset + size[stackNumber] - 1;
    }

    // push Method
    public void push(int stackNumber, int value) {
        if (isFull(stackNumber)) {
            System.out.println("Stack full");
            return;
        } else {
            size[stackNumber]++;
            int index = indexOfTop(stackNumber);
            values[index] = value;
        }
    }

    // pop Method
    public int pop(int stackNumber) {
        if (isEmpty(stackNumber)) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int lastValue = values[indexOfTop(stackNumber)];
            values[indexOfTop(stackNumber)] = 0;
            size[stackNumber]--;
            return lastValue;
        }
    }

    // peek Method
    public int peek(int stackNumber) {
        if (isEmpty(stackNumber)) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return values[indexOfTop(stackNumber)];
        }
    }
}
