import java.util.Scanner;


public class Exercise5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Homework 1: ");
        float homework1 = scanner.nextFloat();

        System.out.print("Homework 2: ");
        float homework2 = scanner.nextFloat();

        System.out.print("Homework 3: ");
        float homework3 = scanner.nextFloat();

        System.out.print("Quiz 1: ");
        float quiz1 = scanner.nextFloat();

        System.out.print("Quiz 2: ");
        float quiz2 = scanner.nextFloat();

        System.out.print("Test 1: ");
        float test1 = scanner.nextFloat();

        double homeworkAverage = (homework1 + homework2 + homework3)/3;
        double quizAverage = (quiz1 + quiz2)/2;

        double overallGrade = homeworkAverage*.15 + quizAverage*.35 + test1*.5;

        System.out.printf("%.2f", overallGrade);
        System.out.print("%");
    }
}