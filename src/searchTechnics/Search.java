package searchTechnics;

public interface Search {
    boolean find();
}

class Test {
    static int[] array;

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
        } else for (i = 0; i < array.length && array[i] != item; i++) ;


        return (array[i] == item) ? i : -1;

    }
}