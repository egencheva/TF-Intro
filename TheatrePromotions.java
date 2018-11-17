import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weekday = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        if (age <= 18 && age >= 0) {
            switch (weekday) {
                case "Weekday":
                    price = 12;
                    break;
                case "Weekend":
                    price = 15;
                    break;
                case "Holiday":
                    price = 5;
                    break;
            }
            System.out.printf("%d$", price);
        } else if (age > 18 && age <= 64) {
            switch (weekday) {
                case "Weekday":
                    price = 18;
                    break;
                case "Weekend":
                    price = 20;
                    break;
                case "Holiday":
                    price = 12;
                    break;
            }
            System.out.printf("%d$", price);
        } else if (age > 64 && age <= 122) {
            switch (weekday) {
                case "Weekday":
                    price = 12;
                    break;
                case "Weekend":
                    price = 15;
                    break;
                case "Holiday":
                    price = 10;
                    break;
            }
            System.out.printf("%d$", price);
        } else if (age < 0 || age > 122) {
            System.out.println("Error!");
        }

    }
}
