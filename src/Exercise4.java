import java.util.Scanner;


public class Exercise4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Height: ");
        double height = scanner.nextDouble();

        System.out.print("Width: ");
        double width = scanner.nextDouble();

        double heightCenti = height*2.54;
        double widthCenti = width*2.54;
        double perimiter = heightCenti*2 + widthCenti*2;

        System.out.printf("%,.2f", perimiter);
        System.out.print(" centimeters.");

        scanner.close();
    }
}

