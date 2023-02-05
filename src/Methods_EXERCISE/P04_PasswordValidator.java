package Methods_EXERCISE;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (!isValidLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidContent(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValidDigitsCount(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidContent(password) && isValidContent(password) && isValidDigitsCount(password)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLength(String password) {
        return 6 <= password.length() && password.length() <= 10;
    }

    public static boolean isValidContent(String password) {
        for (char currentSymbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(currentSymbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidDigitsCount(String password) {
        byte digitCount = 0;
        for (char currentSymbol : password.toCharArray()) {
            if (Character.isDigit(currentSymbol)) {
                digitCount++;
            }
        }
        if (digitCount >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
