import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int programLang = scanner.nextInt();

        switch (programLang) {
            case 1:
                System.out.println("Yes!");
                break;
                //Oh, I can just make the switch statement fall through. Right.
            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }

}