import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //Doing it like this for additional flexibility. Doubt I'll get more than one input.
        while (scanner.hasNextInt()) {
            int move = scanner.nextInt();
            switch (move) {
                case 0:
                    System.out.println("do not move");
                    break;
                case 1:
                    System.out.println("move up");
                    break;
                case 2:
                    System.out.println("move down");
                    break;
                case 3:
                    System.out.println("move left");
                    break;
                case 4:
                    System.out.println("move right");
                    break;
                default:
                    System.out.println("error!");
                    break;
            }

        }


    }
}