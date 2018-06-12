package bubbleSort;

import maintenance.AsyncTask;
import maintenance.Mocker;
import maintenance.SortSpecification;

/**
 * Created by R.Arabzadeh Taktell on 4/7/2018.
 */
public class BubbleSortImple extends AsyncTask implements SortSpecification {


    private int [] arrays;


    public BubbleSortImple(Mocker mocker) {

        mocker.getMockArray();
    }

    @Override
    protected void onPreExcute() {
        super.onStart();
    }

    @Override
    protected void doInBackGround() {
        sort(arrays);
    }

    @Override
    protected void onPostExcute(Long timeElapsed) {
        super.onStop();
    }


    @Override
    public int[] sort(int[] array) {
        return new int[0];
    }
}
