package stackUsingLinkedList;

public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    // push method
    public void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted value :" + value);
    }

    // isEmpty Method
    public boolean isEmpty() {
        if (linkedList.head == null) {
            System.out.println("Linked List is Empty");
            return true;

        } else {
            System.out.println("Linked List is Not Empty");
            return false;

        }
    }

    // pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Is Empty");
            return -1;
        }
        int poppedValue = linkedList.head.value;
        linkedList.deletionOfLinkedList(0);
        return poppedValue;

    }

    // peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    // delete method
    public void deleteStack() {
        linkedList.head = null;
        System.out.println("Stack Deleted Successfully.");

    }
}
