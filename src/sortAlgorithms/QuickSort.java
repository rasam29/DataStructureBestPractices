package sortAlgorithms;

public class QuickSort implements Sort{

    int[] array;
    @Override
    public int[] sort(int[] array) {
        this.array = array;
        quickSort(0,array.length-1);
        return this.array;
    }

    private  void quickSort(int lowerIndex, int higherIndex) {

        int left = lowerIndex;
        int right = higherIndex;
        int current = left;
        int temp;
        // calculate pivot number, I am taking pivot as middle index number

        // Divide into two arrays
        while (left < right) {

            while (current < right && array[current] < array[right])
                right--;
            temp = array[right];
            array[right] = array[current];
            array[current] = temp;
            current = right;

            while (current > left && array[current] > array[left])
                left++;
            temp = array[left];
            array[left] = array[current];
            array[current] = temp;
            current = left;

        }
//         call quickSort() method recursively
        if (lowerIndex < right)
            quickSort(current + 1, higherIndex);
        if (left < higherIndex)
            quickSort(lowerIndex, current - 1);
    }


}
