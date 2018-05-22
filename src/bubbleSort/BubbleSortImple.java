package bubbleSort;

import maintenance.AsyncTask;
import maintenance.Mocker;
import maintenance.SortSpecification;

/**
 * Created by R.Arabzadeh Taktell on 4/7/2018.
 */
public class BubbleSortImple extends AsyncTask implements SortSpecification {

    Mocker mocker;


    public BubbleSortImple(Mocker mocker) {
        this.mocker = mocker;
    }

    @Override
    protected void onPreExcute() {
        super.onStart();
    }

    @Override
    protected void doInBackGround() {
        sort(mocker.getMockArray());
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
