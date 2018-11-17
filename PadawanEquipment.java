import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numStudents = Integer.parseInt(scanner.nextLine());
        double priceSabers = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());
        double totalAmount = 0.0;

        priceSabers = Math.ceil(numStudents * 1.1) * priceSabers;
        priceRobe = numStudents * priceRobe;
        priceBelt = (numStudents - Math.floor(numStudents / 6)) * priceBelt;

        totalAmount = priceBelt + priceRobe + priceSabers;
        if (totalAmount <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalAmount);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", Math.abs(totalAmount - budget));

        }
    }
}
