import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();
        boolean isOrdered = false;

        while (scanner.hasNext()) {
            stringList.add(scanner.next());
        }

        for (int i = 0; i < stringList.size(); i++) {
            int compareStatus;
            if (i == 0) {
                continue;
            } else {
                compareStatus = stringList.get(i).compareTo(stringList.get(i - 1));
                if (compareStatus <= -1) {
                    isOrdered = false;
                    break;
                } else {
                    if (stringList.get(i).equals("a") && stringList.get(i - 1).equals("z")) {
                        //Hacky hack that hacks, but should prevent issues with "z a"
                        isOrdered = false;
                    }
                    isOrdered = stringList.get(i).length() >= stringList.get(i - 1).length();
                }
            }
        }

        System.out.println(isOrdered);
    }
}