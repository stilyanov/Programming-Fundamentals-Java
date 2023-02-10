package Methods;

import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

//        double calculate = calculate(firstNumber, operator, secondNumber);
        System.out.println((int)calculate(firstNumber, operator, secondNumber));
    }

    public static double calculate(int a, String operator, int b) {
        double result = 0;
        switch (operator) {
            case "/":
                result = a * 1.0 / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }
}
