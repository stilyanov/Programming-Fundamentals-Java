package DataTypeAndVariables_MoreExercise;

import java.util.Scanner;

public class P05_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int nChar = Integer.parseInt(scanner.nextLine());

        String text = "";
        char lastChar = 0;

        for (int i = 1; i <= nChar; i++) {
            char currentChar = scanner.nextLine().charAt(0);

            for (char j = currentChar; j <= currentChar + key; j++) {
                lastChar = j;
            }
            text += lastChar;
        }
        System.out.println(text);
    }
}
