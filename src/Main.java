import linkList.DoubleLinkList;
import linkList.HeaderLinkList;
import linkList.LinkList;
import linkList.List;
import linkList.nodes.Node;


/**
 * Created by R.Arabzadeh Taktell on 4/7/2018.
 */
public class Main {
    private static int array[] = {0, 1020, 10, 30, 21, 14, 8};

    public static void main(String[] args) {
        System.out.println(new power().power(3,3));
//        List list = new LinkList();
//
//        list.add(1);
//        list.add(8);
//        list.add(3);
//        list.add(6);
//        list.add(11);
//        list.add(5);
//
//
//        list.reverese();
//
//        list.print();




    }


    public static void bubbleSort() {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - j; j++) {
                if (array[j] < array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static void selectionSort() {
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
    }

    public static void insertationSort() {
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

    }

    public static boolean basicSearch(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;

    }

    public static boolean simpleParetoSearch(int value) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                return true;
            }
        }
        return false;

    }

    public static boolean paretoSearch(int value) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value && i > (array.length * -0.2)) {
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                return true;
            }
        }
        return false;

    }


    private static void quickSort(int lowerIndex, int higherIndex) {

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

    private static int binarySearchRecursive(int item, int left, int right) {
        int mid = (right - left) / 2;
        if (item == array[mid]) {
            return mid;
        } else if (item > array[mid]) {
            binarySearchRecursive(item, mid + 1, right);
        } else if (item < array[mid]) {
            binarySearchRecursive(item, left, mid - 1);
        }
        return -1;
    }

    private static int binarySearch(int item) {
        int left = 0, right = array.length;
        while (left <= right) {
            int mid = (right - left) / 2;
            if (array[mid] == item) {
                return mid;
            } else if (item > array[mid]) {
                left = mid + 1;
            } else if (item < array[mid]) {
                right = mid - 1;
            } else throw new IllegalArgumentException("Not a Illegl Numeric");
        }
        return -1;
    }

    private static int linearSearch(int item, boolean isSorted) {

        int i;
        if (isSorted) {
            for (i = 0; i < array.length && item > array[i]; i++) ;
        } else for (i = 0;i<array.length && array[i] != item;i++);


        return (array[i]== item)?i:-1;

    }


}
