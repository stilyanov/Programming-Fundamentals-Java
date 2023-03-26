package Final_Exam_Retake_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([@|#])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> validPairs = new ArrayList<>();
        int counter = 0;

        while (matcher.find()) {
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            counter++;

            String secondWordBackwards = new StringBuilder(secondWord).reverse().toString();
            if (firstWord.equals(secondWordBackwards)) {
                validPairs.add(firstWord + " <=> " + secondWord);
            }
        }
        if (counter == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(counter + " word pairs found!");
        }

        if (validPairs.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", validPairs));
        }
    }
}
