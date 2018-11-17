import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbersInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());
        int sum = 0;

        for (BigInteger i = first; i.compareTo(second) <= 0;
             i = i.add(BigInteger.valueOf(1))) {
            System.out.println(i);
        }
    }
}