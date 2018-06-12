package linkList;


import linkList.nodes.DoubleNode;

/**
 * Created by R.Arabzadeh Taktell on 4/22/2018.
 */
public class DoubleLinkListHeaderTailor implements List {


    private DoubleNode start = null;
    private DoubleNode end = null;
    private int size;

    public DoubleLinkListHeaderTailor() {
        this.start = new DoubleNode();
        this.end = new DoubleNode();
        start.next = end;
        end.priv = start;
    }

    public void add(int item) {
        DoubleNode p = new DoubleNode(item);
        DoubleNode lastDoubleNode = traverse(item);
        p.next = lastDoubleNode;
        p.priv = lastDoubleNode.priv;
        lastDoubleNode.priv.next = p;
        lastDoubleNode.priv = p;
    }


    public void print() {
        DoubleNode doubleNode = start.next;
        while (doubleNode != end) {
            System.out.println(doubleNode.info);
            doubleNode = doubleNode.next;

        }

    }


    public int getSize(){
        return size;
    }

    public boolean delete(int item) {
        //for int value
        DoubleNode lastNode = traverse(item);
        if (lastNode.info != item){
            // do nothing here
        }else {


            lastNode.priv.next = lastNode.next;
            lastNode.next.priv = lastNode.priv;
        }




//        //for generic data types
//        DoubleNode t = start.next;
//        while (t.info != end){
//            if (t.info == item){
//                t.priv.next = t.next;
//                t.next.priv = t.priv;
//                return true;
//            }
//            t = t.next;
//        }
        return true;

    }

    public DoubleNode traverse(int item) {
        this.size = 0;
        DoubleNode t = start.next;

        //if you want to have sorted list based on integer
        while (t != end && t.info < item) {
            t = t.next;
            size++;
        }

//        while (t != end) {
//           t = t.next;
//           size++;
//       }
        return t;
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
