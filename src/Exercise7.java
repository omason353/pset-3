import java.util.Scanner;


public class Exercise7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        salary = salary/24;

        System.out.print("401(k): ");
        double fourOneK = scanner.nextDouble();

        System.out.print("Federal: ");
        double federal = scanner.nextDouble();

        System.out.print("State: ");
        double state = scanner.nextDouble();

        double taxTotal = (fourOneK + federal + state)/100;


        double totalPay = salary * 1-taxTotal;
        System.out.print("$");
        System.out.printf("%,.2f", totalPay);

        scanner.close();

    }
}