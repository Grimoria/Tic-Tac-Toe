import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        long toReturn = 1;
        //If the initial number is zero, just return 1.
        if (n == 0) {
            //do literally nothing, lol.
        } else {
            //Otherwise, multiply by every number in sequence.
            for (long i = n; i > 0; --i) {
                toReturn = i * toReturn;
            }
        }
        return toReturn;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}