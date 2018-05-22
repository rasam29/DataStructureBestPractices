/**
 * Created by Rasam on 5/17/2018.
 */
public class BinaryTree {
    Node root;

    public boolean add(int item) {
        Node p;
        try {
            p = new Node(item);
        } catch (StackOverflowError error) {
            return false;
        }
        if (root == null) {
            root = p;
            return true;
        }
        Node t = root, s = null;
        while (t != null) {
            s = t;
            t = (item <= t.info) ? t.left : t.right;
        }
        if (item <= s.info) {
            s.left = p;
        } else s.right = p;

        return true;
    }

    public boolean findItem(int item) {
        Node t;
        if (root != null) {
            t = root;
        } else return false;

        while (t != null && t.info != item)
            t = (item <= t.info) ? t.left : t.right;

        return (t != null);


    }


    public void lnr() {
        if (root != null){
            lnr(root);
        }
    }

    private void lnr(Node item) {
        if (item.left != null) {
            lnr(item.left);
        }
        System.out.println(item.info);
        if (item.right != null) {
            lnr(item.right);
        }
    }

    private class Node {
        private Node right;
        private Node left;
        private int info;

        public Node(int info) {
            this.info = info;
        }

        public Node() {
        }
    }
}
