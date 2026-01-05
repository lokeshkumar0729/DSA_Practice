package Trees;

public class AVL {
    private class Node {
        int value;
        Node left;
        Node right;
        int height;

        private Node(int value) {
            this.value = value;
        }

        private int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {

    }

    public int getHeight() {
        return getHeight(root);
    }

    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(Node node) {
        return node == null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        }
        if (value > node.value) {
            node.right = insert(node.right, value);
        }
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if (getHeight(node.left) - getHeight(node.right) > 1) {
            // two cases
            // left is heavy
            // left left case
            if (getHeight(node.left.left) - getHeight(node.left.right) > 0) {
                return RightRotate(node);
            }
            // left right case
            if (getHeight(node.left.left) - getHeight(node.left.right) < 0) {
                node.left = LeftRotate(node.left);
                return RightRotate(node);
            }
        }

        if (getHeight(node.left) - getHeight(node.right) < -1) {
            // two cases
            // right is heavy
            // right right case
            if (getHeight(node.right.left) - getHeight(node.right.right) < 0) {
                return LeftRotate(node);
            }
            // left right case
            if (getHeight(node.right.left) - getHeight(node.right.right) > 0) {
                node.right = RightRotate(node.right);
                return LeftRotate(node);
            }
        }
        return node;
    }

    public Node RightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;

        return c;
    }

    public Node LeftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;

        return p;
    }

    public boolean balanced() {
        return balanced(root);
    }

    public boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left)
                && balanced(node.right);
    }

    public void display() {
        display(root, "Root Node:");
    }

    public void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left side of " + node.value + ":");
        display(node.right, "right side of " + node.value + ":");
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void pretydisplay() {
        pretydisplay(root, 0);
    }

    public void pretydisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        pretydisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|----->" + node.value);
        } else {
            System.out.println(node.value);
        }
        pretydisplay(node.left, level + 1);
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    public void populateSorted(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;
        insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public static void main(String[] args) {
        AVL tree = new AVL();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // tree.populateSorted(nums);
        tree.populate(nums);
        tree.display();
        tree.pretydisplay();
        System.out.println(tree.getHeight());
    }
}
