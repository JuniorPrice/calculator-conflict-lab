import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//<<<<<<< HEAD

        // Multiplication and Division
//=======
        // Addition and Subtraction
//>>>>>>> 9a7553bdb569f97b0fa566b08a2c9a93dead8473
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
//<<<<<<< HEAD
        int product = num1 * num2;
        int quotient = num1 / num2;
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

//=======
        int sum = num1 + num2;
        int difference = num1 - num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
//>>>>>>> 9a7553bdb569f97b0fa566b08a2c9a93dead8473
        scanner.close();
    }
}