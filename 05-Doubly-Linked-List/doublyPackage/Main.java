package doublyPackage;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(5);
        dll.insertDLL(1, 0);
        dll.insertDLL(10, 2);
        dll.insertDLL(20, 3);
        // System.out.println(dll.head.value);
        // System.out.println(dll.head.next.value);
        // System.out.println(dll.head.next.next.value);
        System.out.print("Traversal : ");
        dll.traverseDLL();
        System.out.print("Reverse Traversal : ");
        dll.reverseTraversalDLL();
        dll.searchDLL(0);
        dll.traverseDLL();
        dll.deleteNodeDLL(2);
        dll.traverseDLL();
        dll.deleteEntireDLL();
        dll.traverseDLL();
    }
}
