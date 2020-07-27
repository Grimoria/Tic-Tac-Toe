import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long lowerBound = scanner.nextLong();
        long upperBound = scanner.nextLong();

        long currResult = lowerBound;

        for (long i = lowerBound + 1; i < upperBound; i++) {
            currResult = currResult * i;
        }

        System.out.print(currResult);
    }
}