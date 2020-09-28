import java.util.Scanner;


public class Exercise6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wage: ");
        double wage = scanner.nextDouble();

        System.out.print("Monday: ");
        double totalHours = scanner.nextDouble();

        System.out.print("Tuesday: ");
        totalHours += scanner.nextDouble();

        System.out.print("Wednessday: ");
        totalHours += scanner.nextDouble();

        System.out.print("Thursday: ");
        totalHours += scanner.nextDouble();

        System.out.print("Friday: ");
        totalHours += scanner.nextDouble();

        System.out.print("Saturday: ");
        totalHours += scanner.nextDouble();

        System.out.print("Sunday: ");
        totalHours += scanner.nextDouble();

        double totalPay = totalHours * wage;
        System.out.print("$");
        System.out.printf("%,.2f", totalPay);
    }
}