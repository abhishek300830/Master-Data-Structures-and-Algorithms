package stackUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Empty : " + isEmpty);
        int poopedValue = stack.pop();
        System.out.println("Deleted Value : " + poopedValue);
        int poopedValue1 = stack.pop();
        System.out.println("Deleted Value : " + poopedValue1);
        int peekedValue = stack.peek();
        System.out.println(peekedValue);
        stack.deleteStack();

    }
}
