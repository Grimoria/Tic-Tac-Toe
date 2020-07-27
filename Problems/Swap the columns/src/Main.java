import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int arrayLength = scanner.nextInt();
        int arrayWidth = scanner.nextInt();
        
        int[][] array = new int[arrayLength][arrayWidth];

        //Initialise the Array of int Arrays...
        //Requires input from the Scanner, so code likely doesn't work outside of tests.
        for (int i = 0; i < arrayLength; i++) {
            for (int l = 0; l < arrayWidth; l++) {
                array[i][l] = scanner.nextInt();
            }
        }
/*
        //Debugging code.
        //Was used to test to see if the initial array matched the input.
        for (int i = 0; i < arrayLength; i++) {
            for (int l = 0; l < arrayWidth; l++) {
                System.out.print(array[i][l] + " ");
            }
            System.out.println();
        }

 */

        //Define indexes...
        int indexI = scanner.nextInt();
        int indexJ = scanner.nextInt();

        //Swap the two arrays, after storing one...
        int[] tempstorage = new int[arrayLength];
        /*if (arrayLength >= 0) System.arraycopy(array[indexI], 0, tempstorage, 0, arrayLength);
        if (arrayLength >= 0) System.arraycopy(array[indexJ], 0, array[indexI], 0, arrayLength);
        if (arrayLength >= 0) System.arraycopy(tempstorage, 0, array[indexJ], 0, arrayLength);
         */
        for (int i = 0; i < arrayLength; i++) {
             tempstorage[i] = array[i][indexI];
        }
        for (int i = 0; i < arrayLength; i++) {
            array[i][indexI] = array[i][indexJ];
        }
        for (int i = 0; i < arrayLength; i++) {
            array[i][indexJ] = tempstorage[i];
        }

        //Then print the entire series out again.
        for (int i = 0; i < arrayLength; i++) {
            for (int l = 0; l < arrayWidth; l++) {
                System.out.print(array[i][l] + " ");
            }
            System.out.println();
        }

    }
}