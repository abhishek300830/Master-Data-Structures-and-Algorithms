package doublyPackage;

public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    // create Doubly Linked List
    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    // insertion Method
    public void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) { // Insert at begining
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) { // insert at end
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else { // insert at Given Location
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            tempNode.next = newNode;
            newNode.next.prev = newNode;

        }
        size++;
    }
}
