package avlTree;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    BinaryNode root;

    // Constructor
    AVLTree() {
        root = null;
    }

    // preOrder Traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
            System.out.println("Empty");
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // InOrder Traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // PostOrder Traversal
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // Level Order Traversal
    public void levelOrder(BinaryNode node) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            BinaryNode currNode = queue.remove();
            System.out.print(currNode.value + " ");
            if (currNode.left != null) {
                queue.add(currNode.left);
            }
            if (currNode.right != null) {
                queue.add(currNode.right);
            }
        }
    }

    // Search in AVL Tree by me
    public void searchMe(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Not Found");
            return;
        }
        if (root.value == value) {
            System.out.println("Element Found");
        } else if (root.value < value) {
            searchMe(node.right, value);
        } else {
            searchMe(node.left, value);
        }
    }

    // Search in AVL
    public BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Not Found");
            return null;
        }
        if (root.value == value) {
            System.out.println("Element Found");
            return node;
        } else if (root.value < value) {
            return search(node.right, value);
        } else {
            return search(node.left, value);
        }
    }

}
