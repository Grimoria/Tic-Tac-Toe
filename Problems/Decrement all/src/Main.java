import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        int a = number1 - 1;
        int b = number2 - 1;
        int c = number3 - 1;
        int d = number4 - 1;

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}