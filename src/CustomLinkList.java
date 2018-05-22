/**
 * Created by R.Arabzadeh Taktell on 4/22/2018.
 */
public class CustomLinkList<T> {

    private class Node<t> {
        Node priv;
        T info;
        Node next;

        public Node(T info) {
            this.info = info;
        }

        public Node() {}
    }
    private Node start = null;
    private Node end = null;
    private int size;

    public CustomLinkList() {
        this.start = new Node();
        this.end = new Node();
        start.next = end;
        end.priv = start;
    }

    public void add(T item) {
        Node p = new Node(item);
        Node lastNode = traverse(item);
        p.next = lastNode;
        p.priv = lastNode.priv;
        lastNode.priv.next = p;
        lastNode.priv = p;
    }


    public void print() {
        Node node = start.next;
        while (node != end) {
            System.out.println(node.info.toString());
            node = node.next;

        }

    }


    public int getSize(){
        return size;
    }

    public boolean delete(T item) {
        //for int value
//        Node lastNode = traverse(item);
//        if (lastNode.info != item){
//            // do nothing here
//        }else {
//
//
//            lastNode.priv.next = lastNode.next;
//            lastNode.next.priv = lastNode.priv;
//        }




        //for generic data types
        Node t = start.next;
        while (t.info != end){
            if (t.info == item){
                t.priv.next = t.next;
                t.next.priv = t.priv;
                return true;
            }
            t = t.next;
        }
        return false;

    }

    public Node traverse(T item) {
        this.size = 0;
        Node t = start.next;

        //if you want to have sorted list based on integer
//        while (t != end && t.info < item) {
//            t = t.next;
//            size++;
//        }

        while (t != end) {
           t = t.next;
           size++;
       }
        return t;
    }






}
