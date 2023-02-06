package stackAndQueueQuestions;

import java.util.EmptyStackException;

public class StackofPlates {
    private int capacity;
    public StackofPlatesNode top;
    public StackofPlatesNode bottom;
    public int size = 0;

    StackofPlates(int capacity) {
        this.capacity = capacity;
    }

    // isFull Method
    public boolean isFull() {
        return capacity == size; // if capacity == size then it will return true otherwise false.
    }

    // join two stacks
    public void join(StackofPlatesNode above, StackofPlatesNode below) {
        if (below != null) {
            below.above = above;
        }
        if (above != null) {
            above.below = below;
        }
    }

    // push Method
    public boolean push(int value) {
        if (size >= capacity) {
            return false;
        }
        size++;
        StackofPlatesNode newNode = new StackofPlatesNode(value);
        if (size == 1) {
            bottom = newNode;
        }
        join(newNode, top);
        top = newNode;
        return true;
    }

    // pop Method
    public void pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
    }
}