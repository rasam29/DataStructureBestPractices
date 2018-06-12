package stack;

/**
 * Created by R.Arabzadeh Taktell on 5/23/2018.
 */
public interface Stack<T> {
    T geTopItem();
    T pop();
    boolean push(T data);
    void printStack();
}
