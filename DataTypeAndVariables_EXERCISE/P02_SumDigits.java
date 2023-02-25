package DataTypeAndVariables_EXERCISE;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumDigit = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sumDigit += lastDigit;
            number = number / 10;
        }
        System.out.println(sumDigit);
    }
}
