package Final_Exam_4;

import java.util.Arrays;
import java.util.Scanner;

public class P01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();


        String commands = scanner.nextLine();
        while (!commands.equals("Done")) {
            if (commands.contains("TakeOdd")) {
                password = takeOddSymbols(password);

            } else if (commands.contains("Cut")) {
                //•	"Cut {index} {length}"
                int index = Integer.parseInt(commands.split(" ")[1]);
                int length = Integer.parseInt(commands.split(" ")[2]);
                StringBuilder builder = new StringBuilder(password);
                builder.delete(index, index + length);
                password = builder.toString();

                System.out.println(password);

            } else if (commands.contains("Substitute")) {
                //"Substitute {substring} {substitute}"
                String substring = commands.split(" ")[1];
                String substitute = commands.split(" ")[2];
                if (password.contains(substring)) {
                    password = password.replace(substring, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            commands = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }

    private static String takeOddSymbols(String password) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index <= password.length() - 1; index++) {
            char symbol = password.charAt(index);

            if (index % 2 != 0) {
                builder.append(symbol);
            }
        }
        password = builder.toString();
        System.out.println(password);
        return password;
    }
}
