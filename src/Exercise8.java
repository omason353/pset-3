import java.util.Scanner;


public class Exercise8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Students: ");
        int riders = scanner.nextInt();

        System.out.print("Teachers: ");
        riders += scanner.nextInt();

        System.out.print("Capacity: ");
        int capacty = scanner.nextInt();

        int overflow = (riders)%capacty;
        int busses = (riders-overflow)/capacty;
        System.out.print("Busses Required: ");
        System.out.println(busses+1);
        System.out.print("Overflow Passengers: ");
        System.out.println(overflow);
    }
}