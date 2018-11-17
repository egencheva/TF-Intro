import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLostGames = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());
        double amount = 0.0;


        int trashedHeadset = numLostGames / 2;
        int trashedMouse = numLostGames / 3;
        int trashedKeyboard = numLostGames / 6;
        int trashedDisplay = numLostGames / 12;

        amount = trashedHeadset * priceHeadset + trashedMouse * priceMouse + trashedKeyboard * priceKeyboard + trashedDisplay * priceDisplay;

        System.out.printf("Rage expenses: %.2f lv.", amount);

    }
}
