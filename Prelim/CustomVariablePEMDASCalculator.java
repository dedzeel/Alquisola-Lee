import java.util.Scanner;

public class CustomVariablePEMDASCalculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple PEMDAS Calculator!");
        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();

        double result = evaluateExpression(expression);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static double evaluateExpression(String expression) {
        String[] tokens = expression.split(" ");
        double num1 = Double.parseDouble(tokens[0]);
        double num2 = Double.parseDouble(tokens[2]);
        char operator = tokens[1].charAt(0);

        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.err.println("Error: Division by zero");
                    System.exit(1);
                }
                return num1 / num2;
            default:
                System.err.println("Error: Invalid operator");
                System.exit(1);
                return 0;
        }
    }
}