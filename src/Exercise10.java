import java.util.Scanner;


public class Exercise10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit-32)*0.5556;
        double kelvin = celsius + 273.15;

        System.out.print("\nCelsius: ");
        System.out.printf("%.2f", celsius);
        System.out.print("\nKelvin: ");
        System.out.printf("%.2f", kelvin);
        scanner.close();

    }
}