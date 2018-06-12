package linkList;

import linkList.nodes.Node;

/**
 * Created by Rasam on 6/7/2018.
 */
public class HeaderLinkList implements List {
    Node start = null;


    public HeaderLinkList() {
        this.start = new Node();
    }

    @Override
    public void add(int item) {
        Node p = new Node(item);
        if (p == null) return;

        Node t = start.next, s = start;
        while (t != null && item > t.item) {
            s = t;
            t = t.next;
        }

        p.next = t;
        s.next = p;

    }

    @Override
    public void print() {
        Node t = start.next;
        while (t != null) {
            System.out.println(t.item);
            t = t.next;
        }


    }

    @Override
    public boolean delete(int item) {
        Node t = start.next, s = start;
        while (t != null && item > t.item) {
            s = t;
            t = t.next;
        }

        if (t == null || item < t.item)
            return false;

        s.next = t.next;
        return true;
    }

    @Override
    public void reverese() {

    }
}
