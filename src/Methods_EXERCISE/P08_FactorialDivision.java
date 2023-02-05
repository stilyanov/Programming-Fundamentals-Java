package Methods_EXERCISE;

import java.util.Scanner;

public class P08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        long fact1 = calculateFactorial(firstNumber);
        long fact2 = calculateFactorial(secondNumber);
        double total = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", total);
    }

    public static long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
