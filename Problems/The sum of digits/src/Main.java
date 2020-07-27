import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int toSplit = scanner.nextInt();

        int digit100 = toSplit / 100 % 10;
        int digit10 = toSplit / 10 % 10;
        int digit1 = toSplit % 100 % 10;

        int sum = digit100 + digit10 + digit1;

        /*

        //Test code: remove once you figured out the problem.
        //First digit is on top, and down from there.
        System.out.println(digit1);
        System.out.println(digit10);
        System.out.println(digit100);

         */

        System.out.println(sum);



    }
}