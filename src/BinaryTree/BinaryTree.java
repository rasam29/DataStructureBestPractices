package BinaryTree;

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


    public boolean delete(int item) {
        Node t = root, s = null;
        while (t != null) {
            s = t;
            t = (item > t.info) ? t.right : t.left;
        }


        if (t == null) return false;


        if (t.left != null && t.right == null) {
            Node suc = t.right, psuc = null;
            while (suc.left != null) {
                psuc = suc;
                suc = suc.left;
            }
            if (psuc != null) {
                psuc.left = suc.right;
            } else {
                t.right = suc.right;
            }
            t.info = suc.info;


        } else {
            Node child = t.left;
            if (t.right != null) child = t.right;
            if (s == null) child = root;
            if (s.left == t) {
                s.left = child;
            } else s.right = child;


        }

        return true;

    }

    public void lnr() {
        if (root != null) {
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

    public int getTreeDepth() {
        return getTreeDepth(root);
    }

    private int getTreeDepth(Node tree) {
        if (tree == null) {
            return 0;
        }
        int rightDepth = getTreeDepth(tree.right);
        int leftDepth = getTreeDepth(tree.left);

        return Math.max(rightDepth, leftDepth) + 1;

    }

    public int leafCount() {
        return leafCount(root);


    }

    private int leafCount(Node node) {
        if (node == null) return 0;
        if (node.right == null && node.left == null) {
            return 1;
        }
        return leafCount(node.right) + leafCount(node.left);

    }

    private int leafCountType2(Node node) {
        if (node.right == null && node.left == null) {
            return 1;
        }

        int rightCount = 0,leftCount = 0;
        if (node.right!= null) rightCount = leafCount(node.right);
        if (node.left!= null) leftCount = leafCount(node.left);

        return rightCount+leftCount;

    }


    public int getTreeDiameter() {
        return getTreeDepth(root);
    }

    public int getTreeDiameter(Node node) {
        return getTreeDepth(node.right) + getTreeDepth(node.left);
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

