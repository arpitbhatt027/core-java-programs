package basic_programs;

import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("Random Number - " + Math.random());
        System.out.println("Random Number in range");

        System.out.println("Enter minimum");
        Scanner scanner = new Scanner(System.in);
        int minimum = scanner.nextInt();
        System.out.println("Enter maximum");
        int maximum = scanner.nextInt();
        int random  = (int)(Math.random()*(maximum-minimum+1)+minimum);
        System.out.println("Random value between " + minimum +" and " + maximum + " is " + random);


    }
}
