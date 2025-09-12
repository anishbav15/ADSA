import java.util.Scanner;
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}


class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Method to insert a new key based on user input
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    // Traversal methods
    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " ");
        }
    }

    // Search for a key
    public Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (key < root.key) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }
}
public class search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.print("Enter the number of elements to insert: ");
        int numElements = scanner.nextInt();

        System.out.println("Enter " + numElements + " integer keys:");
        for (int i = 0; i < numElements; i++) {
            int key = scanner.nextInt();
            tree.insert(key);
        }

        System.out.println("\n--- Binary Tree Traversal Results ---");
        System.out.print("Pre-order traversal: ");
        tree.preOrder(tree.root);
        System.out.print("\nIn-order traversal: ");
        tree.inOrder(tree.root);
        System.out.print("\nPost-order traversal: ");
        tree.postOrder(tree.root);

        System.out.print("\n\n--- Search Operation ---");
        System.out.print("\nEnter a key to search for: ");
        int keyToSearch = scanner.nextInt();

        Node result = tree.search(tree.root, keyToSearch);
        if (result != null) {
            System.out.println("Key " + keyToSearch + " found in the tree.");
        } else {
            System.out.println("Key " + keyToSearch + " not found in the tree.");
        }

        scanner.close();
    }
}