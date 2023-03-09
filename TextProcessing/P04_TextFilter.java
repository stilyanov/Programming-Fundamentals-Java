package TextProcessing;

import java.util.Scanner;

public class P04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {
            String asterisk = replaceText(word.length());
            text = text.replace(word, asterisk);
        }
        System.out.println(text);
    }
    public static String replaceText(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "*";
        }
        return result;
    }
}
