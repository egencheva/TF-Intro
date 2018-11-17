import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int input = Integer.parseInt(n);
        int number = input;
        int lastDigit = 0;
        int factorial = 1;
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            lastDigit = number % 10;
            number = number / 10;
            factorial = 1;
            for (int j = lastDigit; j >= 1; j--) {
                factorial *= j;
            }
            sum += factorial;
        }
        if (input == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
