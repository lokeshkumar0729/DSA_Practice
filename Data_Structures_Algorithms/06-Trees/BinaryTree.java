package Trees;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int x) {
            this.value = x;
        }
    }

    private Node root;

    public void populate(Scanner sc) {
        System.out.print("Enter the Root Node:");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.print("Do you want to insert left of " + node.value + "(Y/N):");
        String left = sc.next();
        if (left.equals("Y") || left.equals("y")) {
            System.out.print("Enter the value to the left of " + node.value + ":");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.print("Do you want to insert right of " + node.value + "(Y/N):");
        String right = sc.next();
        if (right.equals("Y") || right.equals("y")) {
            System.out.print("Enter the value to the right of " + node.value + ":");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display() {
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void pretydisplay() {
        pretydisplay(root, 0);
    }

    private void pretydisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        pretydisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|--------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        pretydisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        // tree.display();
        tree.pretydisplay();
    }
}
