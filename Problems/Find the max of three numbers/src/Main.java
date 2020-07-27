import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        //Present because otherwise there will be a No Return Error, which is nonsense.
        //Is a byte because I do not need larger for this method.
        byte toReturn;
        if (a >= b) {
            if (a >= c) {
                toReturn = 1;
            } else {
                //If a isn't bigger or equal to c, the biggest is c.
                toReturn = 3;
            }
        } else if (b >= c) {
            toReturn = 2;
        } else {
            toReturn = 3;
        }
        return toReturn;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}