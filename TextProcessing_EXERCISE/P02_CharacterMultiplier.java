package TextProcessing_EXERCISE;

import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] texts = scanner.nextLine().split("\\s+");
        String firstText = texts[0];
        String secondText = texts[1];

        int minLength = Math.min(firstText.length(), secondText.length());
        int maxLength = Math.max(firstText.length(), secondText.length());

        int sum = 0;
        for (int index = 0; index < minLength; index++) {
            sum += (firstText.charAt(index) * (secondText.charAt(index)));
        }

        if (maxLength == minLength) {
            System.out.println(sum);
            return;
        }

        if (maxLength == firstText.length()) {
            for (int index = minLength; index < firstText.length(); index++) {
                sum += firstText.charAt(index);
            }
        } else {
            for (int index = minLength; index < secondText.length(); index++) {
                sum += secondText.charAt(index);
            }
        }
        System.out.println(sum);
    }
}
