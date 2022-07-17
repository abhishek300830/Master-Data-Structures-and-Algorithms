package queueUsingLinkedList;

public class QueueMain {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enQueue(10);
        queue.enQueue(30);
        queue.enQueue(40);
        boolean isEmpty = queue.isEmpty();
        System.out.println("isEmpty : " + isEmpty);
        int delete = queue.deQueue();
        System.out.println(delete);
        int peek = queue.peek();
        System.out.println("peek : " + peek);
        queue.deleteQueue();

    }
}
