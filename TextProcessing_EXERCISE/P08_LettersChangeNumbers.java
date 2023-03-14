package TextProcessing_EXERCISE;

import java.util.Scanner;

public class P08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] texts = scanner.nextLine().split("\\s+");
        //A12b s17G

        double totalSum = 0;
        for (String code : texts) {
            double modifiedNumber = getModifiedNumber(code);
            totalSum += modifiedNumber;
        }

        System.out.printf("%.2f", totalSum);
    }

    private static double modifyLetterBefore(char letterBefore, double number) {
        if (Character.isUpperCase(letterBefore)) {
            int positionUpper = (int) letterBefore - 64;
            number = number / positionUpper;
        } else {
            int positionLower = (int) letterBefore - 96;
            number = number * positionLower;
        }
        return number;
    }

    private static double modifyLetterAfter(char letterAfter, double number) {
        if (Character.isUpperCase(letterAfter)) {
            int positionUpper = (int) letterAfter - 64;
            number = number - positionUpper;
        } else {
            int positionLower = (int) letterAfter - 96;
            number = number + positionLower;
        }
        return number;
    }

    private static double getModifiedNumber(String text) {
        char letterBefore = text.charAt(0);
        char letterAfter = text.charAt(text.length() - 1);
        double number = Double.parseDouble(text.replace(letterBefore, ' ').replace(letterAfter, ' ').trim());
        number = modifyLetterBefore(letterBefore, number);
        number = modifyLetterAfter(letterAfter, number);
        return number;
    }
}
