import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int bridgesToPass = scanner.nextInt();
        int whereCrash = 0;
        boolean hasCrashed = false;

        for (int i = 0; i < bridgesToPass; i++) {
            int currBridgeHeight = scanner.nextInt();
            if (currBridgeHeight <= busHeight) {
                hasCrashed = true;
                whereCrash = i + 1;
                break;
            }
        }

        if (hasCrashed) {
            System.out.println("Will crash on bridge " + whereCrash);
        } else {
            System.out.println("Will not crash");
        }
    }
}