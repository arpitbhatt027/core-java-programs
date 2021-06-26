package basic_programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        checkPalindrome(number);

        System.out.println("Enter any String");
        String value = scanner.next();
        checkPalindrome(value);
    }

    public static void checkPalindrome(int number) {
        int remainder;
        int sum = 0;
        int temp = number;
        while (number > 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        System.out.println(temp + " is " + ((sum == temp) ? "a Palindrome Number" : "Not a Palindrome number"));
    }

    public static void checkPalindrome(String value) {
        String originalString = value;
        StringBuilder reverse = new StringBuilder("");

        for (int i = value.length() - 1; i >= 0; i--)
            reverse = reverse.append(value.charAt(i));

        System.out.println(originalString + " is " + ((originalString.equals(reverse)) ? "a Palindrome String" : "Not a Palindrome String"));
    }
}
