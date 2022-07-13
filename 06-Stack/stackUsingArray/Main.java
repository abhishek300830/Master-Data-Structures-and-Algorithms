package stackUsingArray;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(5);
        boolean isEmpty = newStack.isEmpty();
        boolean isFull = newStack.isFull();
        System.out.println(isEmpty);
        System.out.println(isFull);
        newStack.push(5);
        newStack.push(10);
        newStack.push(16);
        newStack.push(20);
        newStack.push(25);
        int pop = newStack.pop();
        System.out.println("Popped item is : " + pop);
        int pop1 = newStack.pop();
        System.out.println("Popped item is : " + pop1);
        int peek = newStack.peek();
        System.out.println("peeked item is :" + peek);
        int peek1 = newStack.peek();
        System.out.println("peeked item is :" + peek1);
        newStack.deleteStack();
        int peek2 = newStack.peek();
        System.out.println("peeked item is :" + peek2);

    }
}