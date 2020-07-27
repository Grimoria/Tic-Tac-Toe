import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //Presumption made because if there is only 1 or 0 non-0 numbers...
        boolean isOrdered = true;
        //Zero is the default.
        int test1, test2 = 0;
        boolean orderTest = false;
        boolean sortUp = false;
        boolean sortDown = false;

        while (scanner.hasNextInt()) {
            test1 = scanner.nextInt();
            if (test1 == 0) {
                break;
            } else if (test2 == 0) {
                //If test2 is zero, then I have nothing to compare to yet.
                //Since continue brings control back to the scanner check, I must set test2 to test1 here.
                test2 = test1;
                continue;
            } else if (test1 == test2) {
                //No need to bother testing this situation.
                //Bothering to set test2 to test1 for consistency.
                test2 = test1;
                continue;
            } else if (test1 > test2) {
                if (!orderTest) {
                    orderTest = true;
                    sortUp = true;
                } else if (sortDown) {
                    isOrdered = false;
                    break;
                }
            } else if (test1 < test2) {
                if (!orderTest) {
                    orderTest = true;
                    sortDown = true;
                } else if (sortUp) {
                    isOrdered = false;
                    break;
                }

            }
            test2 = test1;
        }

        System.out.println(isOrdered);

    }
}