package lesson4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SomeDuplicates {
    private static void arrayCheck(List<Integer> elements) {
        HashMap<Integer, Integer> duplicates = new HashMap<>();
        elements.forEach(e -> duplicates.put(e, duplicates.get(e) == null ? 1 : duplicates.get(e) + 1));
        List<Map.Entry<Integer, Integer>> result = duplicates.entrySet().stream().filter(d -> d.getValue() > 1).collect(Collectors.toList());
        result.forEach(e -> System.out.println(String.format("Элемент %d  встречается %d раз", e.getKey(), e.getValue())));
    }

    public static void main(String[] args) {
        List<Integer> elements = IntStream.range(1, 101).boxed().collect(Collectors.toList());
        elements.set(97, 23);
        elements.set(27, 51);
        elements.set(99, 23);
        arrayCheck(elements);
    }
}
