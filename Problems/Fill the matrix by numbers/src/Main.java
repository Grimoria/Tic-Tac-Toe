import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();


        for (int i = 1; i <= size; i++) {
            for (int l = 1; l <= size; l++) {
                System.out.print(Math.abs(l - i) + " ");
            }
            System.out.println();
        }
    }
}