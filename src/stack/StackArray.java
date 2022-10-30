package stack;

import java.lang.reflect.Array;

/**
 * Created by R.Arabzadeh Taktell on 5/23/2018.
 */
public class StackArray<T> implements Stack<T> {

    private final T[] arrays;
    private int topOfStack;

    public StackArray(int count, Class<T> tClass) {
        arrays = (T[]) Array.newInstance(tClass, count);
        topOfStack = -1;
    }

    @Override
    public T geTopItem() {
        if (topOfStack == -1) {
            return null;
        }

        return arrays[topOfStack];
    }

    @Override
    public T pop() {
        if (topOfStack == -1) {
            return null;
        }

        return arrays[topOfStack--];
    }

    @Override
    public boolean push(T data) {
        if (topOfStack > arrays.length) {
            //stack overflow
            return false;
        }
        arrays[++topOfStack] = data;
        return true;

    }

    @Override
    public void printStack() {

    }
}
