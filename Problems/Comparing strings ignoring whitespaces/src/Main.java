import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        System.out.println(removeWhitespaceAndCompare(string1, string2));


    }

    public static boolean removeWhitespaceAndCompare(String a, String b) {
        String aRemove = a.replace(" ", "");
        String bRemove = b.replace(" ", "");

        return aRemove.equals(bRemove);
    }
}