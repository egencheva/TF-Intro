import java.util.Scanner;

public class EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String digit="";

        int lastDigit=input%10;
        switch (lastDigit){
            case 1:
                digit=("one");
                break;
            case 2:
                digit=("two");
                break;
            case 3:
                digit=("three");
                break;
            case 4:
                digit=("four");
                break;
            case 5:
                digit=("five");
                break;
            case 6:
                digit=("six");
                break;
            case 7:
                digit=("seven");
                break;
            case 8:
                digit=("eight");
                break;
            case 9:
                digit=("nine");
                break;
            case 0:
                digit=("ten");
                break;
        }
        System.out.println(digit);
    }
}