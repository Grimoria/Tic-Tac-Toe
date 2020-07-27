import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        float moneyInput = scanner.nextInt();
        float depositIncreasePercent = scanner.nextInt();
        float moneyGoal = scanner.nextInt();
        int yearsTotal = 0;
        float currMoney = moneyInput;

        while (currMoney < moneyGoal) {
            currMoney = currMoney + (currMoney * ((depositIncreasePercent / 100)));
            yearsTotal++;
        }

        System.out.println(yearsTotal);

    }
}