package basic_programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Using normal way - " + usingNormalWay(number));
        System.out.println("Using recursion - " + usingResursion(number));
    }

    static int usingNormalWay(int number) {
        if (number <= 0) {
            return 1;
        } else {
            int fact = 1;
            for (int i = 1; i <=number ; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

    static int usingResursion (int number) {
        if (number <= 0) {
            return 1;
        } else {
            return (number * usingResursion(number - 1));
        }
    }
}
