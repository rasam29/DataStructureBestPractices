package queue;

/**
 * Created by Rasam on 6/9/2018.
 */
public class Qarray {


    private int[] array;


    private int front;
    private int rear;


    public Qarray() {
        this.front = -1;
        this.rear = -1;
    }

    public boolean add(int item) {
        if ((rear + 1) % array.length == front) return false;

        if (rear == -1) {
            rear = front = 0;


        } else
            rear = (rear + 1) % array.length;
        array[rear] = item;
        return true;
    }


    public void delete() {
        if (front == -1) {
            return;
            //stack underflow
        }

        if (front == rear) {
            front = rear = -1;

        } else front = (front + 1) % array.length;
    }

}
