
public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularSLL(5);
        csll.insertNode(4, 1);
        csll.insertNode(10, 1);
        // System.out.println(csll.head.value);
        // System.out.println(csll.head.next.value);
        // System.out.println(csll.head.next.next.value);
        csll.printLinkedList();
        csll.searchLinkedList(4);
        System.out.println("Size : " + csll.size);
        csll.deleteNode(3);
        csll.printLinkedList();
        System.out.println("Size : " + csll.size);
        csll.deleteEntireLinkedList();
        csll.printLinkedList();

    }
}
