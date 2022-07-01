package singlyPackage;

public class SinglylinkedList {
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
        while (tempNode != null) {
            if (tempNode.value == nodeValue) {
                System.out.println("Match Found! at Location : " + tempNode);
                return;
            }
            tempNode = tempNode.next;
        }
        System.out.println("Value Not Found");

    }

}
