package DataTypeAndVariables_LAB;

import java.util.Scanner;

public class P12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;

        int currentNum = 0;

        boolean isSpecial = false;

        for (int i = 1; i <= number; i++) {

            currentNum = i;

            while (i > 0) {
                totalSum += i % 10;
                i = i / 10;
            }
            isSpecial = (totalSum == 5) || (totalSum == 7) || (totalSum == 11);
            System.out.printf("%d -> %b%n", currentNum, isSpecial);
            totalSum = 0;
            i = currentNum;
        }
    }
}
