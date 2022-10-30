package searchTechnics;


class SearchImplementation {
    static int[] array;

    public class BasicSearch implements Search {

        @Override
        public boolean find(int value) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return true;
                }
            }
            return false;
        }
    }

    public class SimpleParetorSearch implements Search {

        @Override
        public boolean find(int value) {
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
    }


    public class ParetoSearch implements Search {

        @Override
        public boolean find(int value) {
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
    }


    public class BinarySearchRecursiveSearch implements Search {

        @Override
        public boolean find(int value) {
            return binarySearchRecursive(value, 0, array.length - 1) != -1;
        }

        private int binarySearchRecursive(int item, int left, int right) {
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
    }


    public class BinarySearch implements Search {
        @Override
        public boolean find(int value) {
            return binarySearch(value) != -1;
        }

        private int binarySearch(int item) {
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
    }


    public class LinearSearch implements Search {
        private final boolean isSorted;

        public LinearSearch(boolean isSorted) {
            this.isSorted = isSorted;
        }

        @Override
        public boolean find(int value) {
            return linearSearch(value, isSorted) != -1;
        }

        private int linearSearch(int item, boolean isSorted) {

            int i;
            if (isSorted) {
                for (i = 0; i < array.length && item > array[i]; i++) ;
            } else for (i = 0; i < array.length && array[i] != item; i++) ;


            return (array[i] == item) ? i : -1;

        }
    }


}