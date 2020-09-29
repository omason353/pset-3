import java.util.Scanner;


public class Exercise3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Height: ");
        double height = scanner.nextDouble();

        System.out.print("Width: ");
        double width = scanner.nextDouble();

        double heightMili = height*25.4;
        double widthMili = width*25.4;
        double area = heightMili * widthMili;

        System.out.printf("%,.2f", area);
        System.out.print(" square milimeters.");

        scanner.close();
    }
}
