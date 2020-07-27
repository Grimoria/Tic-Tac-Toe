
import java.util.Scanner;

class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // put your code here

        String roomShape = scanner.next().toLowerCase();
        double roomArea = roomArea(roomShape);
        System.out.println(roomArea);

    }

    public static double roomArea(String shape) {
        switch (shape) {
            case "rectangle":
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                return length * width;
            case "triangle":
                double base = scanner.nextDouble();
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double semiPerimeter = (base + side1 + side2) / 2;
                return Math.sqrt(semiPerimeter *
                        ((semiPerimeter - base) *
                                (semiPerimeter - side1) *
                                (semiPerimeter - side2)));
            case "circle":
                double radius = scanner.nextDouble();
                //Not pi, blame JetBrain.
                return 3.14 * Math.pow(radius, 2);
            default: //Likely unneeded, but there anyways.
                return Double.MIN_VALUE;

        }
    }

}