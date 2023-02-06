package BinaryTreeUsingArray;

public class BinaryTreeArray {
    String[] array;
    int lastUsedIndex;

    BinaryTreeArray(int size) {
        this.array = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Empty Tree Of size " + size + " Created Successfully");
    }

    // Check Tree is Full or Not
    public boolean isFull() {
        if (lastUsedIndex == array.length - 1) {
            return true;
        }
        return false;
    }

    // Insertion Method
    public void insert(String value) {
        if (!isFull()) {
            array[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println(value + " Inserted in Tree");

        } else {
            System.out.println(value + " is Not Inserted! Tree is Full");
        }
    }

    // DFS-PreOrder Traversal
    public void preOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(array[index] + " ");
        preOrder(index * 2);
        preOrder((index * 2) + 1);
    }

    // DFS-InOrder Traversal
    public void inOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2);
        System.out.print(array[index] + " ");
        inOrder((index * 2) + 1);
    }

    // DFS - PostOrder Traversal
    public void postOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(index * 2);
        postOrder((index * 2) + 1);
        System.out.print(array[index] + " ");

    }

    // BFS -Level Order Traversal
    public void levelOrder() {
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Searching
    public int search(String value) {
        for (int i = 1; i <= lastUsedIndex; i++) {
            if (array[i] == value) {
                System.out.println(value + " Found at Location " + i);
                return i;
            }

        }
        System.out.println(value + " Not Exist in Tree");
        return -1;
    }

    // Delete Node
    public void delete(String value) {
        int Location = search(value);
        if (Location == -1) {
            System.out.println("Element Not Found");
            return;
        } else {
            array[Location] = array[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("Node Successfully Deleted.");
        }
    }

    // Delete Entire Tree
    public void deleteEntireTree() {
        try {
            array = null;
            System.out.println("\nTree Deleted Successfully");
        } catch (Exception e) {
            System.out.println(e + "Tree Not Deleted");
        }
    }
}
