package TextProcessing;

import java.util.Scanner;

public class P01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        while (!text.equals("end")) {
            String reverseText = "";
            for (int i = text.length() - 1; i >= 0 ; i--) {
                char symbol = text.charAt(i);
                reverseText += symbol;
            }
            System.out.println(text + " = " + reverseText);

            text = scanner.nextLine();
        }
    }
}
