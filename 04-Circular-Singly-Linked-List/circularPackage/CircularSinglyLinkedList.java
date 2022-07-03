public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularSLL(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        // to make it circular
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insertion in Circular LL
    public void insertNode(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCircularSLL(nodeValue);
            return;
        } else if (location == 0) { // insertion at start
            node.next = head;
            head = node;
            tail.next = node;
            size++;
        } else if (location >= size) {
            tail.next = node;
            node.next = head;
            tail = node;
            size++;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;

            size++;
        }
    }

    // Traversal Method
    public void printLinkedList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i < size - 1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    // search Method
    public boolean searchLinkedList(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println(nodeValue + " is Found at index : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not Found");
        return false;
    }

    // delete Method
    public void deleteNode(int location) {

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        } else if (location == 0) { // deleting from first
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size - 1) { // deleting last Node size -1 because location start with 0 and size start
                                           // with 1
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;

            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // delete entire Linked List
    public void deleteEntireLinkedList() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            tail.next = null;
            head = tail = null;
            size = 0;
            System.out.println("Entire Linked List Deleted Successfully");
        }
    }

}
