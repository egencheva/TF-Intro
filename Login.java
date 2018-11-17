import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        String pass = scanner.nextLine();
        int n = username.length();
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        while (!pass.equals(password) && count < 4) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!%n", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            pass = scanner.nextLine();
        }
        if (pass.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
