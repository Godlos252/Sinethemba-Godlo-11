import java.util.Scanner;  // Import Scanner class

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        scanner.close();  // Close Scanner to prevent resource leaks
    }
}
