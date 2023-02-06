package BinaryTree;

// This is implemented using Linked List
public class BinaryMain {

    public static void main(String[] args) {
        // object initialization of BinaryTreeLL
        BinaryTreeLL BinaryTree = new BinaryTreeLL();

        // BinaryNode N1 = new BinaryNode();
        // BinaryNode N2 = new BinaryNode();
        // BinaryNode N3 = new BinaryNode();
        // BinaryNode N4 = new BinaryNode();
        // BinaryNode N5 = new BinaryNode();
        // BinaryNode N6 = new BinaryNode();
        // BinaryNode N7 = new BinaryNode();
        // BinaryNode N8 = new BinaryNode();
        // BinaryNode N9 = new BinaryNode();
        // N1.value = "N1";
        // N2.value = "N2";
        // N3.value = "N3";
        // N4.value = "N4";
        // N5.value = "N5";
        // N6.value = "N6";
        // N7.value = "N7";
        // N8.value = "N8";
        // N9.value = "N9";

        // N1.leftChild = N2;
        // N1.rightChild = N3;

        // N2.leftChild = N4;
        // N2.rightChild = N5;

        // N3.leftChild = N6;
        // N3.rightChild = N7;

        // N4.leftChild = N8;
        // N4.rightChild = N9;

        // BinaryTree.root = N1;
        BinaryTree.insert("N1");
        BinaryTree.insert("N2");
        BinaryTree.insert("N3");
        BinaryTree.insert("N4");
        BinaryTree.insert("N5");
        BinaryTree.insert("N6");
        BinaryTree.insert("N7");
        BinaryTree.insert("N8");
        BinaryTree.insert("N9");

        System.out.println("Pre Order");
        BinaryTree.preOrder(BinaryTree.root);
        System.out.println();
        System.out.println("In Order");
        BinaryTree.InOrder(BinaryTree.root);
        System.out.println();
        System.out.println("Post Order");
        BinaryTree.postOrder(BinaryTree.root);
        System.out.println();
        System.out.println("Level Order");
        BinaryTree.LevelOrder();

        System.out.println("\nSearching Element in Tree");
        BinaryTree.Search("N6");

        System.out.println("Get Deepest Node : ");
        BinaryNode lastNode = BinaryTree.getDeepestNode();
        System.out.println(lastNode.value);

        System.out.println("Deleting the Last Node:");
        BinaryTree.deleteTheDeepestNode();
        BinaryTree.LevelOrder();

        System.out.println("\nDeleting the Given Node :");
        BinaryTree.deleteGivenNode("N3");
        BinaryTree.LevelOrder();

        System.out.println("\nDeleting Entire Binary Tree : ");
        BinaryTree.deleteEntireTree();
        BinaryTree.LevelOrder();
    }

}
