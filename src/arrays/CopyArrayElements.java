package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CopyArrayElements {
    public static void main(String[] args) {
        manualCopy();
        byMethod();
    }

    static void manualCopy() {
        System.out.println("\tManual Copy");
        int[] numberList1 = new int[]{1, 2, 3, 4, 5};
        int[] numberList2 = new int[numberList1.length];

        for (int i = 0; i < numberList1.length; i++) {
            numberList2[i] = numberList1[i];
        }

        System.out.println("First List - ");
        IntStream numberList1Stream = Arrays.stream(numberList1);
        numberList1Stream.forEach(number -> System.out.print(number + " "));

        System.out.println("\nSecond List - ");
        IntStream numberList2Stream = Arrays.stream(numberList1);
        numberList2Stream.forEach(number -> System.out.print(number + " "));
    }

    static void byMethod() {
        System.out.println("\n\tUsing arrayCopy() method");
        int[] numberList1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numberList2 = new int[numberList1.length];
        System.arraycopy(numberList1, 0, numberList2, 2, 5);

        System.out.println("First List - ");
        IntStream numberList1Stream = Arrays.stream(numberList1);
        numberList1Stream.forEach(number -> System.out.print(number + " "));

        System.out.println("\nSecond List - ");
        IntStream numberList2Stream = Arrays.stream(numberList2);
        numberList2Stream.forEach(number -> System.out.print(number + " "));
    }
}
