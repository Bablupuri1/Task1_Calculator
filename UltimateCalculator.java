import java.util.Scanner;

public class UltimateCalculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division with zero check
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println(" Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("Welcome to Ultimate Calculator 🔥");
        System.out.println("Operations: +, -, *, / | Type 'exit' to quit");

        while (continueCalc) {
            System.out.print("\nEnter first number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println(" Invalid input. Please enter a number.");
                scanner.next(); // clear invalid input
                continue;
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Enter second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println(" Invalid input. Please enter a number.");
                scanner.next(); // clear invalid input
                continue;
            }
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case "+":
                    result = add(num1, num2);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    break;
                case "*":
                    result = multiply(num1, num2);
                    break;
                case "/":
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println(" Invalid operator. Use +, -, *, or /.");
                    continue;
            }

            System.out.println(" Result: " + result);

            System.out.print("Do you want to continue? (yes/no): ");
            String choice = scanner.next().toLowerCase();
            if (!choice.equals("yes")) {
                continueCalc = false;
                System.out.println("👋 Exiting Ultimate Calculator. Stay sharp, coder!");
            }
        }

        scanner.close();
    }
}
