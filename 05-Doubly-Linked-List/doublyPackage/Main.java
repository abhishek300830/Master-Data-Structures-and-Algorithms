package doublyPackage;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(5);
        dll.insertDLL(1, 0);
        dll.insertDLL(10, 2);
        System.out.println(dll.head.value);
        System.out.println(dll.head.next.value);
        System.out.println(dll.head.next.next.value);
    }
}
