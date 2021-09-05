package java8;

@FunctionalInterface
interface CalculateSquare {
    int getSquare(int number);
}

public class FindSquareUsingLamda {
    public static void main(String[] args) {
        CalculateSquare calculateSquare = (number) -> number * number;
        System.out.println(calculateSquare.getSquare(5));
    }
}
