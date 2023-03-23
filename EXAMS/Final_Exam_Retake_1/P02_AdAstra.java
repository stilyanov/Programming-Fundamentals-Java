package Final_Exam_Retake_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([#|])(?<food>[A-z\\s+]+)\\1(?<date>[0-9]{2}/[0-9]{2}/[0-9]{2})\\1(?<calories>[0-9]\\d{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int totalCalories = 0;
        while (matcher.find()) {
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;
        }
        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);
        Matcher matcher2 = pattern.matcher(text);
        while (matcher2.find()) {
            String food = matcher2.group("food");
            String date = matcher2.group("date");
            int calories = Integer.parseInt(matcher2.group("calories"));
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", food, date, calories);
        }
    }
}
