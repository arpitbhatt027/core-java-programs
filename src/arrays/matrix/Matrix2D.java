package arrays.matrix;

import java.util.Scanner;

public class Matrix2D {
    public static void main(String[] args) {
        System.out.println("Enter total rows");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Enter total column");
        int columns = scanner.nextInt();

        int[][] two_D_Array = new int[rows][columns];

        System.out.println("Enter values");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < columns; j++) {
                two_D_Array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Printing 2D Array of: " + rows +" x " + columns);
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(two_D_Array[i][j] +"\t");
            }
            System.out.println();
        }

    }
}
