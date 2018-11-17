import java.util.Scanner;

public class MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());

        if (x <= 10) {

            for (int i = x; (i <= 10); i++) {
                int multiplied = n * i;
                System.out.printf("" + "%d" + " X " + "%d" + " = " + "%d%n", n, i, multiplied);
            }
        } else if (x > 10) {
            int multiplied = n * x;
            System.out.printf("" + "%d" + " X " + "%d" + " = " + "%d%n", n, x, multiplied);

        }
    }
}