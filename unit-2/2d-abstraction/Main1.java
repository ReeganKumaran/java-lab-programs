import java.util.Scanner;

// Abstract class Calculator
abstract class Calculator {
    double number1, number2;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Abstract method for calculation
    abstract double calculate();
}

class Addition extends Calculator {
    public Addition(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    double calculate() {
        return number1 + number2;
    }
}

class Subtraction extends Calculator {
    public Subtraction(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    double calculate() {
        return number1 - number2;
    }
}

class Multiplication extends Calculator {
    public Multiplication(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    double calculate() {
        return number1 * number2;
    }
}

class Division extends Calculator {
    public Division(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    double calculate() {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        Calculator calculator;
        switch (operation) {
            case '+':
                calculator = new Addition(num1, num2);
                System.out.println("Result: " + calculator.calculate());
                break;
            case '-':
                calculator = new Subtraction(num1, num2);
                System.out.println("Result: " + calculator.calculate());
                break;
            case '*':
                calculator = new Multiplication(num1, num2);
                System.out.println("Result: " + calculator.calculate());
                break;
            case '/':
                calculator = new Division(num1, num2);
                System.out.println("Result: " + calculator.calculate());
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        scanner.close();
    }
}
