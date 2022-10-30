package queue;

import java.lang.reflect.Array;

/**
 * Created by Rasam on 5/25/2018.
 */
public class QueueArray<T> implements Queue<T> {
    int rear, front;
    T[] array;

    public QueueArray(Class<T> tClass, int size) {
        array = (T[]) Array.newInstance(tClass, size);
        rear = front = -1;
    }

    @Override
    public boolean add(T item) {
        if (rear == array.length) {
            System.out.println("overflow");
            return false;
        }
        if (rear == -1) {
            rear = front = 0;
            array[rear] = item;
            return true;
        }
        rear++;
        array[rear] = item;
        return true;
    }


    @Override
    public void delete() {
        if (rear == -1) {
            System.out.println("underFLow");
            return;
        }
        if (front == -1) {
            front = rear = -1;
            return;
        }

        front++;
    }

    @Override
    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.println(array[i]);
        }
    }
}
