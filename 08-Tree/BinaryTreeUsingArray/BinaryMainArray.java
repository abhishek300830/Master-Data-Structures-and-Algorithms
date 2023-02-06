package BinaryTreeUsingArray;

public class BinaryMainArray {
    public static void main(String[] args) {
        BinaryTreeArray Tree = new BinaryTreeArray(9);
        Tree.insert("N1");
        Tree.insert("N2");
        Tree.insert("N3");
        Tree.insert("N4");
        Tree.insert("N5");
        Tree.insert("N6");
        Tree.insert("N7");
        Tree.insert("N8");
        Tree.insert("N9");

        // Element storing start from idx 1
        // root node lies at arr[1]
        System.out.println("PreOrder Traversal");
        Tree.preOrder(1);
        System.out.println("\nInOrder Traversal");
        Tree.inOrder(1);
        System.out.println("\nPostOrder Traversal");
        Tree.postOrder(1);
        System.out.println("\nLevelOrder Traversal");
        Tree.levelOrder();

        System.out.println();
        Tree.search("N5");
        Tree.search("N11");

        Tree.delete("N3");
        Tree.levelOrder();

        Tree.deleteEntireTree();
    }

}
