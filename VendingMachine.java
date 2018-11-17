import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double coins = 0.0;
        double money = 0.0;
        double price = 0.0;
        double spent = 0.0;
        boolean isValid = true;

        while (!input.equals("Start")) {
            coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                money += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    isValid = false;
                    break;
            }
            if (isValid) {
                if (money - price < 0) {
                    money = money;
                    System.out.println("Sorry, not enough money");
                } else {
                    money -= price;
                    System.out.println("Purchased " + input);
                }
            } else {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", money);

    }
}
