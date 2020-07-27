import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        System.out.print(canSumTo20(number1, number2, number3));
    }

    public static boolean canSumTo20(int a, int b, int c) {

        if (a + b == 20) {
            return true;
        } else if (b + c == 20) {
            return true;
        } else {
            return a + c == 20;
        }

    }
}