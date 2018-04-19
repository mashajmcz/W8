package lesson4;

public class ConcatString {
    public static void main(String[] args) {
        System.out.println(compareSums(1,5,2147483645, 2147483647));

    }

    public static String concat(String string1, String string2, String string3) {
        return string1 + string2 + string3;
    }

    public static int findDivCount(short a, int b, int n) {
        int counter = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0)
                counter++;
        }
        return counter;
    }

    public static long sum (int from, int to) {
        long sum = 0;
        for (int i = from; i<= to; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static boolean compareSums (int a, int b, int c, int d) {
        return (sum(a,b) > sum(c,d));
    }

}
