package queue;

/**
 * Created by Rasam on 5/24/2018.
 */
public interface Queue<T> {
    boolean add(T item);

    void delete();

    void printQueue();


}
