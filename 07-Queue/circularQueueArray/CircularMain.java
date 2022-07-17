package circularQueueArray;

public class CircularMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(3);
        boolean isEmpty = queue.isEmpty();
        System.out.println(isEmpty);
        boolean isFull = queue.isFull();
        System.out.println(isFull);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        int deQueue = queue.deQueue();
        System.out.println("DeQueue : " + deQueue);
        int peekValue = queue.peek();
        System.out.println("peekValue : " + peekValue);
    }
}
