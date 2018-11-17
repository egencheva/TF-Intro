import java.util.Scanner;

public class BackInFortyMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour=Integer.parseInt(scanner.nextLine());
        int min=Integer.parseInt(scanner.nextLine());

        int ttlMin=hour*60+min;
        int plus30=ttlMin+30;
        int newMin=plus30%60;
        int newHour=plus30/60;

        if (newHour ==24){
            newHour=0;
        }
        System.out.printf(""+"%01d"+":"+"%02d",newHour,newMin);
    }
}

