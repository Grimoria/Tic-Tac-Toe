import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long divisible4max = 0L;

        while (scanner.hasNextLong()) {
            long candidate = scanner.nextLong();
            if (candidate % 4 == 0 && candidate > divisible4max) {
                divisible4max = candidate;
            }
        }

        System.out.println(divisible4max);


    }


}