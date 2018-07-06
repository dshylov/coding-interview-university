package ciu.solutions.algorithms.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,13,14,15,16,17,19,22,33,44,55,66,77,88,99,111};
        int n = 111;
        int indexLoop = binarySearchLoop(myArray, n);
        int indexRec = binarySearchRec(myArray, n);
        System.out.println(String.format("binarySearchLoop. Index of %s is %s", n, indexLoop));
        System.out.println(String.format("binarySearchRec. Index of %s is %s", n, indexRec));
    }

    private static int binarySearchLoop(int[] array, int n) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mean = (left + right) / 2;
            if (n > array[mean]) {
                left = mean + 1;
            } else if (n < array[mean]) {
                right = mean - 1;
            } else {
                return mean;
            }
        }
        return -1;
    }

    private static int binarySearchRec(int[] array, int n) {
        return recEngine(array, n, 0, array.length - 1);
    }

    private static int recEngine(int[] array, int n, int left, int right){
        if (left > right) {
            return -1;
        }

        int mean = (left + right) / 2;

        if (n > array[mean]) {
            return recEngine(array, n, mean + 1, right);
        } else if (n < array[mean]) {
            return recEngine(array, n, left, mean - 1);
        } else {
            return mean;
        }
    }
}
