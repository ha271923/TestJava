package NguyenQuangNinh;

public class BinarySearchTree {
    public static boolean contains(Node root, int value) {
        if(root.value == value) {
            return true;
        }

        if(value > root.value) {
            if(root.right != null) {
                return contains(root.right, value);
            } else {
                return false;
            }
        } else {
            if(root.left != null) {
                return contains(root.left, value);
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n2, 4));
    }

    public static class Node {
        public int value;
        public Node left, right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}