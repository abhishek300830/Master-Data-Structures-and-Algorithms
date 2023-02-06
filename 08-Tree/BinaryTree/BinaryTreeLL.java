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
        if (root == null) {
            System.out.println("Tree is Empty");
            return;
        }
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

    // Search Method
    void Search(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println(value + " Found in Tree.");
                return;
            }
            if (presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);
            }
            if (presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }
        }
        System.out.println(value + " Not Found in Tree");
    }

    // Insert Method
    void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            System.out.println("Inserted Node at Root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.leftChild == null) {
                presentNode.leftChild = newNode;
                System.out.println("Successfully Inserted");
                break;
            } else if (presentNode.rightChild == null) {
                presentNode.rightChild = newNode;
                System.out.println("Successfully Inserted");
                break;
            } else {
                queue.add(presentNode.leftChild);
                queue.add(presentNode.rightChild);
            }
        }
    }

    /*
     * to delete the Node firstly
     * get Deepest Node
     * replace the deepest node with the node you want to delete
     * them delete the deepest Node,
     */
    // Get Deepest Node
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);

            }
            if (presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }
        }
        return presentNode;
    }

    // Delete the Deepest Node
    public void deleteTheDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode prevNode, presentNode = null;
        while (!queue.isEmpty()) {
            prevNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.leftChild == null) {
                prevNode.rightChild = null;
                return;
            } else if (presentNode.rightChild == null) {
                presentNode.leftChild = null;
                return;
            }
            queue.add(presentNode.leftChild);
            queue.add(presentNode.rightChild);

        }

    }

    // Delete Given Node
    public void deleteGivenNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteTheDeepestNode();
                System.out.println(value + " Node Deleted Successfully");
                return;
            } else {
                if (presentNode.leftChild != null) {
                    queue.add(presentNode.leftChild);
                }
                if (presentNode.rightChild != null) {
                    queue.add(presentNode.rightChild);
                }
            }

        }
        System.out.println("The Node Not Exist in Tree.");
    }

    // Delete Entire Binary Tree

    public void deleteEntireTree() {
        if (root == null) {
            System.out.println("Tree is already Empty");
        } else {
            root = null;
            // all extra Node was collected by Grabage Collector.
            System.out.println("Tree Deleted Successfully");
        }
    }

}
