//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[8];
        int i = 0;

        //Scans, and inputs Scanner input into a String array.
        //Needed in order to reverse the input.
        while (scanner.hasNext()) {
            names[i] = scanner.next();
            i++;
        }

        reverseAndOutput(names);

    }

    //If I fail to make this into it's own method, the for statement will fail for some reason.
    //I legitimately do not know why. It makes no sense.
    public static void reverseAndOutput(String[] namesInput) {
        //Actually output the list
        for (int i = 0; i < namesInput.length; i++) {
            System.out.println(namesInput[(namesInput.length - 1) - i]);
        }
    }
}