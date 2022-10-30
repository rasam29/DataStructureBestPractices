import sortAlgorithms.BubbleSort;
import sortAlgorithms.Sort;

import java.util.Arrays;


/**
 * Created by R.Arabzadeh on 4/7/2018.
 */
public class Main {
    private static final int[] array = {1020, 10, 30, 21, 14, 8};

    public static void main(String[] args) {
        Sort s = new BubbleSort();
        String result = Arrays.toString(s.sort(array));
        System.out.println(result);


    }


}
