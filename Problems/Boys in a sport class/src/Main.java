import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height1 = scanner.nextInt();
        int height2 = scanner.nextInt();
        int height3 = scanner.nextInt();

        boolean firstTwoSortedf = height1 >= height2;
        boolean lastTwoSortedf = height2 >= height3;

        boolean firstTwoSortedb = height1 <= height2;
        boolean lastTwoSortedb = height2 <= height3;

        System.out.print((firstTwoSortedf && lastTwoSortedf) ||(firstTwoSortedb && lastTwoSortedb));
    }
}