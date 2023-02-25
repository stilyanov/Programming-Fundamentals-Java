package Methods_EXERCISE;

import java.util.Scanner;

public class P09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            if (isPalindrome(command)) {
//                System.out.println("true");
                System.out.println(isPalindrome(command));
            } else {
//                System.out.println("false");
                System.out.println(isPalindrome(command));
            }

            command = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String text) {
            String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return text.equals(reversedText);
    }
}
