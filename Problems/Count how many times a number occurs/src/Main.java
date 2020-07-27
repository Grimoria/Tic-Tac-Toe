import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        //Unneeded, really.
        int[] inputArray = new int[length];

        for (int i = 0; i <= inputArray.length - 1; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int comparisonNum = scanner.nextInt();
        int foundCompNum = 0;

        for (int i = 0; i <= inputArray.length - 1; i++) {
            if (inputArray[i] == comparisonNum) {
                ++foundCompNum;
            }
        }

        System.out.println(foundCompNum);



    }
}