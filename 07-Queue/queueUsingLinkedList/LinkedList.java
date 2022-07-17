package queueUsingLinkedList;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size = 0;

    // Create Linked List and add first element
    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size++;
        return head;
    }

    // insert Elements to Linked List
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traversal through Linked List
    public void TraverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.value + " -> ");
                tempNode = tempNode.next;
            }
            System.out.println("null");

        }
    }

    // Search in Linked List
    public void searchLinkedList(int nodeValue) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node tempNode = head;
        int i = 0;
        while (i < size) {
            if (tempNode.value == nodeValue) {
                System.out.println(nodeValue + " Found! at Location : " + i);
                return;
            }
            tempNode = tempNode.next;
            i++;
        }
        System.out.println("Value Not Found");

    }

    // Deletion in Singly Linked List
    public void deletionOfLinkedList(int location) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        } else if (location == 0) { // location 0 means deleting first element
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) { // location >= size means deleting from end
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            System.out.println("xxxx" + tempNode.value);
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else { // deleting at a given location
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }

    }

    // deleting entire linked List
    public void deleteEntireLinkedList() {
        head = null;
        tail = null;
        size = 0;
        // System.out.println("Linked List Deleted Successfully");
    }
}
