package sortAlgorithms;

public class SelectionSort implements Sort{



    @Override
    public int[] sort(int[] array) {
        int size = array.length;
        int temp;
        int maxNumberIndex;
        for (int i = 0; i < size; i++) {
            maxNumberIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[maxNumberIndex]) {
                    maxNumberIndex = j;
                }
                if (maxNumberIndex != i) {
                    temp = array[i];
                    array[i] = array[maxNumberIndex];
                    array[maxNumberIndex] = temp;

                }


            }

        }
        return array;
    }




}
