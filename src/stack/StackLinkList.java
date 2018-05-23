package stack;

/**
 * Created by R.Arabzadeh Taktell on 5/23/2018.
 */
public class StackLinkList<T> implements Stack<T> {
    Node topOfStack;

    public StackLinkList() {
        topOfStack = new Node();
    }

    @Override
    public T geTopItem() {
        if (topOfStack == null){
            throw new IndexOutOfBoundsException("stack is empty");
        }
        return topOfStack.info;
    }

    @Override
    public T pop() {
        return null;
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


    class Node {
        Node next;
        T info;

        public Node(T info) {
            this.info = info;
        }

        public Node() {
        }
    }
}
