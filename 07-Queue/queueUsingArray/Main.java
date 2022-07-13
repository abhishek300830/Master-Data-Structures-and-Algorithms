package queueUsingArray;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        boolean isEmpty = queue.isEmpty();
        System.out.println(isEmpty);
        boolean isFull = queue.isFull();
        System.out.println(isFull);
    }

}