package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {

    BinaryNode root;

    // Constructor
    BinaryTreeLL() {
        this.root = null;
    }

    // preOrder Traversal
    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.leftChild);
        preOrder(node.rightChild);
    }

    // InOrder Traversal
    void InOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        InOrder(node.leftChild);
        System.out.print(node.value + " ");
        InOrder(node.rightChild);
    }

    // PostOrder Traversal
    void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.print(node.value + " ");
    }

    // Level Order
    void LevelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode CurrentNode = queue.remove();
            System.out.print(CurrentNode.value + " ");
            if (CurrentNode.leftChild != null) {
                queue.add(CurrentNode.leftChild);
            }
            if (CurrentNode.rightChild != null) {
                queue.add(CurrentNode.rightChild);
            }
        }

    }
}
