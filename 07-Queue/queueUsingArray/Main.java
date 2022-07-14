package queueUsingArray;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        boolean isEmpty = queue.isEmpty();
        System.out.println(isEmpty);
        boolean isFull = queue.isFull();
        System.out.println(isFull);
        int deletedValue = queue.deQueue();
        System.out.println(deletedValue);
        // int deletedValue1 = queue.deQueue();
        // System.out.println(deletedValue1);
        int peekedValue = queue.peek();
        System.out.println(peekedValue);

        queue.delete();

        boolean isEmpty1 = queue.isFull();
        System.out.println(isEmpty1);

    }

}