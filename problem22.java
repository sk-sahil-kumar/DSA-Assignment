import java.util.Scanner;

class Problem22 {

    // Node class for binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        // Method to create tree recursively
        Node createTree(Scanner sc) {
            System.out.print("Enter node value (-1 for no node): ");
            int data = sc.nextInt();
            if (data == -1) {
                return null;
            }
            Node node = new Node(data);
            System.out.println("Enter left child of " + data);
            node.left = createTree(sc);
            System.out.println("Enter right child of " + data);
            node.right = createTree(sc);
            return node;
        }

        // In-order traversal: Left, Root, Right
        void inOrder(Node node) {
            if (node == null) return;
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }

        // Pre-order traversal: Root, Left, Right
        void preOrder(Node node) {
            if (node == null) return;
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }

        // Post-order traversal: Left, Right, Root
        void postOrder(Node node) {
            if (node == null) return;
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("Create Binary Tree:");
        tree.root = tree.createTree(sc);

        System.out.println("\nIn-order traversal:");
        tree.inOrder(tree.root);

        System.out.println("\nPre-order traversal:");
        tree.preOrder(tree.root);

        System.out.println("\nPost-order traversal:");
        tree.postOrder(tree.root);

        sc.close();
    }
}
