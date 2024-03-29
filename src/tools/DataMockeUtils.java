package tools;

import java.util.Random;

/**
 * Created by R.Arabzadeh on 4/9/2018.
 */

public class DataMockeUtils {
    private  int size;
    private Random random;
    private int limit;

    public DataMockeUtils(int size, int limit) {
        this.size = size;
        this.limit = limit;
    }

    public DataMockeUtils(int size) {
        this.size = size;
    }

    private int getRandomNumber(){
        int temp = random.nextInt();
        if (temp<= limit){
            return temp;
        }else return getRandomNumber();
    }

    public int[] getMockArray(){
        int[] tempArray = new int[size];
        for (int i = 0;i<size;i++)
            tempArray[i] = getRandomNumber();

        return tempArray;
    }
}
