import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long sum = 0L;
        boolean encounteredZero = false;

        while (scanner.hasNextLong() && !encounteredZero) {
            long currNum = scanner.nextLong();
            if (currNum == 0L) {
                encounteredZero = true;
            } else {
                sum = sum + currNum;
            }
        }

        System.out.print(sum);

    }
}