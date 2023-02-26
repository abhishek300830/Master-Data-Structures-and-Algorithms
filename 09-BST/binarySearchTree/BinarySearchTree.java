package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;

    BinarySearchTree() {
        root = null;
    }

    // Insert in binary Search Tree
    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            // System.out.println("Value Inserted");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    // preOrder Traversal
    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // InORder traversal
    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // PostOrder Traversal
    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // Level Order Traversal
    public void levelOrder() {
        levelOrder(root);
    }

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

    // search Method
    BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("\nnot Found");
            return null;
        } else if (value == node.value) {
            System.out.println("\nValue Found");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }

    }

    // Minimum node or Successor Node in right sub tree
    static BinaryNode minimumNode(BinaryNode node) {
        if (node.left == null) {
            return node;
        } else {
            return minimumNode(node.left);
        }
    }

    // delete Node from a Tree
    public BinaryNode deleteNode(BinaryNode root, int value) {
        if (root == null) {
            System.out.println("not Found");
            return null;
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            // tree Node has 2 childs
            if (root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNode = minimumNode(temp.right);
                root.value = minNode.value;
                root.right = deleteNode(root.right, minNode.value);
                // tree has only left chid
            } else if (root.left != null) {
                root = root.left;
                // tree has only right child
            } else if (root.right != null) {
                root = root.right;
                // this is leaf node
            } else {
                root = null;

            }
        }
        return root;
    }

    // Delete Complete Binary Tree
    public void DeleteAll() {
        root = null;
        System.out.println("TREE DELETED");
    }
}
