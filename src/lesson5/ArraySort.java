package lesson5;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] array = {9, 9, 6, 4, 0, 9,0,3,0};
        int[] sortedArray = insertionSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] insertionSort(int[] array) {
        for (int lastSortedIndex = 0; lastSortedIndex < array.length - 1; lastSortedIndex++) {

            for (int i = lastSortedIndex + 1; i > 0; i--) {

                if (array[i - 1] < array[i]) break;
                else {
                    int forSwap = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = forSwap;
                }
            }
        }
        return array;
    }
}
