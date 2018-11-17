import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true) {
            num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) {
                break;
            }
            System.out.println("Please write an even number.");
        }
        System.out.printf("The number is: %d", Math.abs(num));

    }

}


