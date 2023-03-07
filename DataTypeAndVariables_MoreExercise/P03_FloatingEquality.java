package DataTypeAndVariables_MoreExercise;

import java.util.Scanner;

public class P03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double difference = 0;

        if (firstNumber < 0 && secondNumber < 0) {
            difference = Math.abs(firstNumber - secondNumber);
        } else if (firstNumber < 0) {
            difference = firstNumber + secondNumber;
        } else if (secondNumber < 0) {
            difference = secondNumber + firstNumber;
        } else  {
            difference = Math.abs(secondNumber - firstNumber);
        }
        double eps = 0.0000001;

        if (difference < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
