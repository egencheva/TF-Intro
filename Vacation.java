import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;
        boolean validDay = true;
        boolean validType = true;

        switch (day) {
            case "Friday":
                switch (type) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.90;
                        break;
                    case "Regular":
                        price = 15.00;
                        break;
                    default:
                        validType = false;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        price = 9.80;
                        break;
                    case "Business":
                        price = 15.60;
                        break;
                    case "Regular":
                        price = 20.00;
                        break;
                    default:
                        validType = false;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16.00;
                        break;
                    case "Regular":
                        price = 22.50;
                        break;
                    default:
                        validType = false;
                }
            default:
                validDay = false;
                break;
        }
        double ttlPrice = num * price;

        if (num >= 30 && type.equals("Students")) {
            ttlPrice = ttlPrice * 0.85;
        }
        if (num >= 100 && type.equals("Business")) {
            ttlPrice = price * (num - 10);
        }
        if (num >= 10&&num<=20 && type.equals("Regular")) {
            ttlPrice = ttlPrice*0.95;
        }
        System.out.printf("Total price: %.2f",ttlPrice);

    }
}