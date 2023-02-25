package Methods_EXERCISE;

import java.util.Scanner;

public class P06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);
    }

    public static void printMiddleCharacter(String text) {
        int middleCharacter = 0;
        int secondMiddleCharacter = 0;
        if (text.length() % 2 == 0) {
            middleCharacter = text.length() / 2;
            secondMiddleCharacter = text.length() / 2 - 1;
            System.out.print(text.charAt(secondMiddleCharacter));
            System.out.print(text.charAt(middleCharacter));
        } else {
            middleCharacter = text.length() / 2;
            System.out.println(text.charAt(middleCharacter));
        }
    }
}
