import sortAlgorithms.BubbleSort;
import sortAlgorithms.Sort;


/**
 * Created by R.Arabzadeh on 4/7/2018.
 */
public class Main {
    private static int[] array = {1020, 10, 30, 21, 14, 8};

    public static void main(String[] args) {
        Sort s = new BubbleSort();
        for (int t :
                s.sort(array)) {
            System.out.println(t);
        }


    }





}
