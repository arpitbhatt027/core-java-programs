package basic_programs;

import java.util.Scanner;

public class FibonacciSeries {
    static int first = 0, second = 1, third = 0;

    public static void main(String[] args) {
        System.out.println("By Normal-1 way or recursion-2 ?");
        Scanner scanner = new Scanner(System.in);

        int type = scanner.nextInt();

        System.out.println("Enter series limit");
        int limit = scanner.nextInt();

        if (type == 1) {
            System.out.println("Normal way - using for loop");
            System.out.print(first + " " + second + " ");
            printFibNormal(limit);
        } else {
            System.out.println("Using recursion");
            System.out.print(first + " " + second + " ");
            printFibRecusrsion(limit);
        }
    }

    public static void printFibNormal(int limit) {
        for (int i = 0; i < limit; i++) {
            third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
        }
    }

    public static void printFibRecusrsion(int limit) {
        if (limit > 0) {
            third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
            printFibRecusrsion(limit - 1);
        }
    }
}
