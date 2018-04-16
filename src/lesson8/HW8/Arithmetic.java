package lesson8.HW8;

public class Arithmetic {

    int min(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min)
                min = element;
        }
        return min;
    }

    int max(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max)
                max = element;
        }
        return max;
    }

    boolean check(int[] array) {
        return (max(array) + min(array) > 100);
    }
}
