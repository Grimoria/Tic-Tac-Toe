import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long bigNum = scanner.nextLong();
        boolean factorialExcessFound = false;
        long smolnum = 1L;


        while (!factorialExcessFound) {
            if (bigNum <= 0 || bigNum == 1) {
                smolnum = 4L;
                factorialExcessFound = true;
            } else {
                long tempFactor = 1;
                for (long i = 1; i <= smolnum; i++) {
                    tempFactor = tempFactor * i;
                }
                if (tempFactor > bigNum) {
                    factorialExcessFound = true;
                } else {
                    smolnum++;
                }
            }
        }

        System.out.println(smolnum);


    }
}