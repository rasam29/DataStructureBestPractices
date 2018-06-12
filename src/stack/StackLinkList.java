package stack;

/**
 * Created by R.Arabzadeh Taktell on 5/23/2018.
 */
public class StackLinkList<T> implements Stack<T> {
    private Node topOfStack;

    public StackLinkList() {

    }

    @Override
    public T geTopItem() {
        if (topOfStack == null){
            return null;
        }
        return topOfStack.info;
    }

    @Override
    public T pop() {
        Node last = topOfStack;
        topOfStack = last.next;
        System.gc();
        return last.info;
    }

    @Override
    public boolean push(T data) {
        Node t;
        try {
            t = new Node(data);
        } catch (Exception e) {
            return false;
            //stackoverflow
        }
        t.next = topOfStack;
        topOfStack = t;
        return true;

    }

    @Override
    public void printStack() {
        Node t = topOfStack;
        while (t != null){
            System.out.println(t.info);
            t = t.next;
        }
    }


    private class Node {
        Node next;
        T info;

        public Node(T info) {
            this.info = info;
        }

        public Node() {
        }
    }
}
