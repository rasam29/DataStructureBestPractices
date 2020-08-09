package sortAlgorithms;

public class InsertionSort implements Sort {


    @Override
    public int[] sort(int[] array) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }
}
