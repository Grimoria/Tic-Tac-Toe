import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int arrayWidth = scanner.nextInt();
        int column = 100;
        int row = 100;
        int savedNum = Integer.MIN_VALUE;
        int[][] array = new int[arrayLength][arrayWidth];

        //Initialise the Array of int Arrays...
        //Requires input from the Scanner, so code likely doesn't work outside of tests.
        for (int i = 0; i < arrayLength; i++) {
            for (int l = 0; l < arrayWidth; l++) {
                array[i][l] = scanner.nextInt();
            }
        }

        //Checks for earliest index.
        //Used to have more complicated checks, since the description led me that way.
        //Don't do that. Try to find the simpler solution. Try to experiment.
        //This is a lesson learned from that comments section.
        for (int i = 0; i < arrayLength; i++) {
            for (int l = 0; l < arrayWidth; l++) {
                if (array[i][l] > savedNum) {
                    //if (l < row || i < column || array[i][l] > savedNum) {
                    column = i;
                    row = l;
                    savedNum = array[i][l];
                    // }
                }

            }
        }
        System.out.print(column + " ");
        System.out.print(row);
    }

}