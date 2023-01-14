package BasicSyntax_EXERCISE;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char letter = username.charAt(i);
            password += letter;
        }

        String newPassword = scanner.nextLine();
        int fails = 0;
        while (!newPassword.equals(password)) {
            fails++;
            if (fails == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            newPassword = scanner.nextLine();
        }

        if (newPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
