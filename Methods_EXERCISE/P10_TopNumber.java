package Methods_EXERCISE;

import java.util.Scanner;

public class P10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            if (isDivisibleBy8(i) && isOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        return sum % 8 == 0;
    }

    public static boolean isOddDigit(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0){
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
