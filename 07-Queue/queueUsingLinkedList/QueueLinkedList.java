package queueUsingLinkedList;

public class QueueLinkedList {
    LinkedList list;

    public QueueLinkedList() {
        list = new LinkedList();
        System.out.println("Queue is Created");

    }

    // isEmpty
    public boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue Method
    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully Inserted Value in Queue");
    }

    // Dequeue Method
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        } else {
            int value = list.head.value;
            list.deletionOfLinkedList(0);
            return value;
        }
    }

    // peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    // Delete Method
    public void deleteQueue() {
        list.deleteEntireLinkedList();
        System.out.println("Queue Deleted Successfully.");
    }
}
