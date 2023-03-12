package TextProcessing_EXERCISE;

import java.util.Scanner;

public class P01_ValidUserNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] username = scanner.nextLine().split(", ");

        for (String user : username) {
            if (isValid(user)) {
                System.out.println(user);
            }
         }

    }

    public static boolean isValid(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
