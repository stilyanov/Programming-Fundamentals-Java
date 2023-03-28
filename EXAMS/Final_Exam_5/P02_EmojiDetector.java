package Final_Exam_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        List<String> emojiList = new ArrayList<>();

        String regex = "(:{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        long coolThreshold = 1;

        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                //'1'-> "1" -> 1
                int number = Integer.parseInt(symbol + "");
                coolThreshold *= number;
            }
        }
        System.out.println("Cool threshold: " + coolThreshold);

        int counterEmoji = 0;

        while (matcher.find()) {
            String emoji = matcher.group("emoji");
            counterEmoji++;
            int asciiTotal = 0;
            for (char symbol : emoji.toCharArray()) {
                asciiTotal += symbol;
            }
            if (asciiTotal >= coolThreshold) {
                emojiList.add(matcher.group());
            }
        }

        System.out.printf("%d emojis found in the text. The cool ones are:%n", counterEmoji);
        emojiList.forEach(System.out::println);
    }
}
