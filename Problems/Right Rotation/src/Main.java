import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //The ArrayList is here because I am otherwise unsure of how I can make an Array of arbitrary and unknown length.
        //They're... not quite the same, but it'll do.
        ArrayList<Integer> input = new ArrayList<>();

        //Yes, this'll also add the rotation amount to the ArrayList.
        //This is easily solved.
        while (scanner.hasNextInt()) {
            input.add(scanner.nextInt());
        }

        //Get and remove the rotation amount from the input ArrayList.
        int rotations = input.get(input.size() - 1);
        input.remove(input.size() - 1);
        //Debugging code that will fail the first test.
        System.out.println(rotations);

        //Now I can use a traditional Array, as the size is now known.
        //Since this task is about traditional Arrays, not ArrayLists, we'll use that.
        int[] rotated = new int[input.size()];

        for (int i = 0; i < rotated.length - 1; i++) {
            //Should loop around once the ArrayList's, and hopefully the Array's, size is exceeded.
            rotated[i] = input.get(i + rotations % input.size() - 1);
            //This printout would make the above unneeded, actually.
            //It's there anyways.
            System.out.print(rotated[i] + " ");
        }

    }
}

/* The actual solution. Or one provided in the Solutions list. I give up.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int move = scanner.nextInt();
        String[] n2 = numbers.clone();
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            j = i + move;
            if (j > numbers.length - 1) {
                j = j % numbers.length;
            }
            n2[j] = numbers[i];
        }
        for (String var : n2) {
            System.out.print(var + " ");
        }
    }
}

 */