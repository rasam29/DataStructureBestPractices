package linkList;

import linkList.nodes.DoubleNode;

/**
 * Created by Rasam on 6/7/2018.
 */
public class DoubleLinkList implements List {
    DoubleNode start = null;
    DoubleNode end = null;
    DoubleNode current = null;


    @Override
    public void add(int item) {
        DoubleNode p = new DoubleNode(item);
        if (p == null) return;

        DoubleNode t = start;
        if (start == null) {
            start = end = p;
            current = start;
            return;
        }

        while (t != null && item > t.info) {
            t = t.next;
        }


        if (t == start) {
            p.next = t;
            t.priv = p;
            start = p;

        } else if (t == null) {
            p.priv = end;
            end.priv = p;
            p = end;


        } else {
            p.next = t;
            p.priv = t.priv;
            t.priv.next = p;
            t.priv = p;

        }


    }

    @Override
    public void print() {
        DoubleNode t = start;
        while (t != null) {
            System.out.println(t.info);
            t = t.next;
        }

    }

    @Override
    public boolean delete(int item) {
        DoubleNode t = start;
        while (t != null && item > t.info) {
            t = t.next;
        }


        if (t == null || item < t.info) {
            return false;
        }

        //Last
        if (t.next != null) {
            t.next.priv = t.priv;
        } else {
            end = t.priv;

        }


        if (t.priv != null) {
            t.priv.next = t.next;
        } else {
            start = t.next;

        }
        return true;
    }

    public void reverese() {
        DoubleNode t = start, temp = null;
        while (t != null) {
            temp = t.next;
            t.next = t.priv;
            t.priv = temp;
        }
        temp = start;
        start = end;
        end = temp;


    }
}
