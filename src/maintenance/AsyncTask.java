package maintenance;

/**
 * Created by R.Arabzadeh Taktell on 4/7/2018.
 */
public abstract class AsyncTask extends Thread {

    private long startTime;
    private long endTime;

    @Override
    public void run() {
        doInBackGround();
        onPostExcute(endTime - startTime);

    }

    public void onStart(){
        startTime = System.currentTimeMillis();
    }

    public void onStop(){
        endTime = System.currentTimeMillis();

    }


    public void excute(){
        onPreExcute();
        this.start();
    }

    protected abstract void onPreExcute();
    protected abstract void doInBackGround();
    protected abstract void onPostExcute(Long timeElapsedMillisecond);
}
