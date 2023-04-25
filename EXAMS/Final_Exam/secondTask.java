package Final_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class secondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            String command = "";
            String text = "";

            String regex = "([!])(?<command>[A-Z][a-z]{2,})\\1:\\[(?<text>[A-Za-z]{8,})\\]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            StringBuilder translated = new StringBuilder();

            if (!matcher.find()) {
                System.out.println("The message is invalid");
                continue;
            } else {
                command = matcher.group("command");

                text = matcher.group("text");

                for (int index = 0; index <= text.length() - 1; index++) {
                    char symbol = text.charAt(index);

                    translated.append(" ").append((int) symbol);
                }
            }
            System.out.println(command + ":" + translated);
        }
    }
}
