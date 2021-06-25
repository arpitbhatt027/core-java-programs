package basic_programs;

import java.util.Scanner;

public class PrimNumber {
    public static void main(String[] args) {
        System.out.print("Enter Number :: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(recursionWay(number) ? "Its a prime number" : "Not a prime number");
    }

    static int i = 2;
    public static boolean recursionWay(int n) {
        if (n == 0 || n == 1)
            return false;

        if (n == i)
            return true;

        // Base cases
        if (n % i == 0) {
            return false;
        }
        i++;
        return recursionWay(n);
    }
}
