import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cupNumber = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend) {
            System.out.print((cupNumber >= 15 && cupNumber <= 25));
        } else {
            System.out.print((cupNumber >= 10 && cupNumber <= 20));
        }
    }
}