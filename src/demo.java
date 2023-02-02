import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;

        while (number > 0){
            int lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }

            number = number / 10;
        }
    }
}
