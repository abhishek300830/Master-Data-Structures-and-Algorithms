package stackAndQueueQuestions;

// Design a stack in such a way that in addition to push and pop it has a function min that return the minimum element of stack
// constraint all operation operate in O(1) time Complexity.

public class StackMin {
    StackMinNode top;
    StackMinNode min;

    public StackMin() {
        top = null;
        min = null;
    }

    // min Method
    public int minimum() {
        return min.value;
    }

    // push Method
    public void push(int value) {
        if (min == null) {
            min = new StackMinNode(value, min);
        } else if (min.value < value) {
            min = new StackMinNode(min.value, min);
        } else {
            min = new StackMinNode(value, min);
        }
        top = new StackMinNode(value, top);
    }

    // pop Method
    public int pop() {
        if (top == null) {
            System.out.println("Stack in Empty");
            return -1;
        } else {
            min = min.next;
            int result = top.value;
            top = top.next;
            return result;
        }

    }
}
