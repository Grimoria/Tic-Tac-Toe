import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (scanner.hasNextInt()) {
            int currNum = scanner.nextInt();
            if (currNum == 0) {
                break;
            } else {
                sum = sum + currNum;
            }

            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }

        }

        System.out.println(sum);
    }
}