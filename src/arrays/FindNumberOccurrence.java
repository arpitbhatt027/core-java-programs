package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FindNumberOccurrence {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 7, 8, 1, 2, 3, 4, 2, 2, 1, 2};

        Map<Integer, Long> numbersMap = new HashMap<>();

        for (Integer number : numbers) {
            if (numbersMap.containsKey(number)) {
                Long occurrence = numbersMap.get(number);
                numbersMap.put(number, occurrence + 1);
            } else {
                numbersMap.put(number, 1L);
            }
        }
        for (Map.Entry<Integer, Long> entry : numbersMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
