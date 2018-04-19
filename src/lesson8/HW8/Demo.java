package lesson8.HW8;

public class Demo {

    public static void main(String[] args) {

        Adder adder = new Adder();
        int[] array = {5, 120, 1, 8, 0};
        adder.check(array);
        adder.add(5,2);
        System.out.println(array[array.length - 1]);
        System.out.println(adder.add(array[1], 2));


    }
}
