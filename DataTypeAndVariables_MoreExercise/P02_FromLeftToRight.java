package DataTypeAndVariables_MoreExercise;

import java.util.Scanner;

public class P02_FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            double leftNumber = Double.parseDouble(scanner.next());
            double rightNumber = Double.parseDouble(scanner.next());

            int sum = 0;
            if (leftNumber > rightNumber) {
                double firstNumber = Math.abs(leftNumber);
                while (firstNumber > 0) {
                    sum += (firstNumber % 10);
                    firstNumber /= 10;
                }
            } else {
                double secondNumber = Math.abs(rightNumber);
                while (secondNumber > 0) {
                    sum += (secondNumber % 10);
                    secondNumber /= 10;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}
