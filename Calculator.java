import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        // Multiplication and Division
        int product = num1 * num2;
        int quotient = num1 / num2;
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Addition and Subtraction
        int sum = num1 + num2;
        int difference = num1 - num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        // Power function
        double power = Math.pow(num1, num2);        
        System.out.println("power: "+ power);

        System.out.println("*** Factorial of First Number ***");
        int result = 1; // Start From 1; because if we start from 0 the result always 0
        for (int i = 1; i <= num1; i++) {
            result = result * i;
        }
        System.out.println("Factorial of " + num1 + " is: " + result);
        scanner.close();
    }
}