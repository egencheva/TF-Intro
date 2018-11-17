import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String backwords = "";
        int n = input.length();

        for (int i = n - 1; i >= 0; i--) {
            backwords += input.charAt(i);
        }
        System.out.println(backwords);

    }
}
