package linkList;

import linkList.nodes.Node;

/**
 * Created by Rasam on 6/7/2018.
 */
public class LinkList implements List {

    Node start = null;

    @Override
    public void add(int item) {
        Node p = new Node(item);
        if (p == null) return;
        Node t = start, s = null;


        while (t != null && item > t.item) {
            s = t;
            t = t.next;
        }
        p.next = t;
        if (s == null) {
            start = p;

        } else {

            s.next = p;
        }

    }

    @Override
    public void print() {
        Node t = start;
        while (t != null) {
            System.out.println(t.item);
            t = t.next;
        }
    }

    @Override
    public boolean delete(int item) {
        Node t = start, s = null;
        while (t != null && item > t.item) {
            s = t;
            t = t.next;
        }
        if (t == null || t.item > item) return false;

        if (s == null) {
            start = t.next;
            return true;
        }
        s.next = t.next;
        return false;
    }


    public void reverese()
    {
        Node r = null, s = start, t = start.next;

        while (s.next != null)
        {

            s.next = r;
            r = s;


            s = t;
            t = t.next;

        }
        s.next = r;
        start = s;
    }


}
