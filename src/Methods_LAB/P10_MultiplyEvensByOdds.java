package Methods_LAB;

import java.util.Scanner;

public class P10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(numberInput));
    }

    public static int getEvenSum(int number) {
        int evenSum = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }

            number = number / 10;
        }
        return evenSum;
    }

    public static int getOddSum(int number) {
        int oddSum = 0;
        while (number > 0){
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                oddSum += lastDigit;
            }

            number = number / 10;
        }
        return oddSum;
    }
    public static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);

        return evenSum * oddSum;
    }
}
