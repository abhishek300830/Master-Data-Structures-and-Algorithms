package binarySearchTree;

public class MainBST {
    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(40);
        newBST.insert(20);
        System.out.println("PreOrder");
        newBST.preOrder();
        System.out.println("\nInOrder");
        newBST.inOrder();
        System.out.println("\nPostOrder");
        newBST.postOrder();
        System.out.println("\nLevelOrder");
        newBST.levelOrder();
        newBST.search(newBST.root, 40);
    }
    // Delete Node in BST
}
