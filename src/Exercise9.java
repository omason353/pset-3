import java.util.Scanner;


public class Exercise9 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        double quarters = (amount-(amount%.25))/.25;
        amount = amount%.25;
        double dimes = (amount-(amount%.10))/.10;
        amount = amount%.10;
        double nickles = (amount-(amount%.05))/.05;
        amount = amount%.05;
        double pennies = (amount-(amount%.01))/.01;

        System.out.print("\nQuarters: ");
        System.out.printf("%.0f", quarters);
        System.out.print("\nDimes: ");
        System.out.printf("%.0f", dimes);
        System.out.print("\nNickles: ");
        System.out.printf("%.0f", nickles);
        System.out.print("\nPennies: ");
        System.out.printf("%.0f", pennies);

        scanner.close();

    }
}