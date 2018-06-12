package queue;



/**
 * Created by Rasam on 5/24/2018.
 */
public class QueueLinkList<T> implements Queue<T> {
    Node front,rear;

    @Override
    public boolean add(T item) {
        Node p = new Node(item);
        if (rear == null){
            rear = front = p;
            return false;
        }else {
            rear.next = p;
            rear = p;
            return true;
        }
    }

    @Override
    public void delete() {



        if (front == null){
            return;
        }
        front = front.next;

    }

    @Override
    public void printQueue() {
        while (front != rear.next){
            System.out.println(front.info);
            front = front.next;
        }
    }


    private class Node{
        Node next;
        T info;

        public Node(T info) {
            this.info = info;
        }

        public Node() {}
    }
}
