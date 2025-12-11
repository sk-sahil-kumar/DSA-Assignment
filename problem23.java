import java.util.Scanner;

class Problem23 {

    // Node class for BST
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BST {
        Node root;

        // Insert a node into BST
        Node insert(Node node, int data) {
            if (node == null) {
                return new Node(data);
            }
            if (data < node.data) {
                node.left = insert(node.left, data);
            } else if (data > node.data) {
                node.right = insert(node.right, data);
            }
            return node; // unchanged
        }

        // Search a node in BST
        boolean search(Node node, int key) {
            if (node == null) return false;
            if (node.data == key) return true;
            if (key < node.data) return search(node.left, key);
            return search(node.right, key);
        }

        // Find minimum node in a subtree
        Node minValueNode(Node node) {
            Node current = node;
            while (current.left != null) {
                current = current.left;
            }
            return current;
        }

        // Delete a node from BST
        Node delete(Node node, int key) {
            if (node == null) return null;

            if (key < node.data) {
                node.left = delete(node.left, key);
            } else if (key > node.data) {
                node.right = delete(node.right, key);
            } else {
                // Node to be deleted found
                if (node.left == null) return node.right;
                else if (node.right == null) return node.left;

                // Node with two children
                Node temp = minValueNode(node.right);
                node.data = temp.data;
                node.right = delete(node.right, temp.data);
            }
            return node;
        }

        // In-order traversal to display BST
        void inOrder(Node node) {
            if (node == null) return;
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();

        while (true) {
            System.out.println("\n1. Insert\n2. Delete\n3. Search\n4. Display (In-order)\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int data = sc.nextInt();
                    bst.root = bst.insert(bst.root, data);
                    break;
                case 2:
                    System.out.print("Enter element to delete: ");
                    int delData = sc.nextInt();
                    bst.root = bst.delete(bst.root, delData);
                    break;
                case 3:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = bst.search(bst.root, key);
                    System.out.println(found ? key + " found in BST." : key + " not found in BST.");
                    break;
                case 4:
                    System.out.println("BST (In-order traversal):");
                    bst.inOrder(bst.root);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

