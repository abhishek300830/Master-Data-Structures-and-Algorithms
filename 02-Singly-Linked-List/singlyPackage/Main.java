package singlyPackage;

public class Main {
    public static void main(String[] args) {
        SinglylinkedList sll = new SinglylinkedList();
        // creating linked list and assigning head
        sll.createSinglyLinkedList(10);
        // inserting Values at Given Location
        sll.insertInLinkedList(20, 1);
        sll.insertInLinkedList(5, 0);
        sll.insertInLinkedList(30, 4);
        sll.insertInLinkedList(40, 5);
        System.out.println("Head of LL : " + sll.head.value);
        System.out.println("Tail of LL : " + sll.tail.value);
        System.out.println("Size of LL : " + sll.size);
        System.out.println("*****************");

        sll.TraverseSinglyLinkedList();
        sll.searchLinkedList(30);
    }
}
