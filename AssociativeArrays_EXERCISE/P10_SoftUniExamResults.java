package AssociativeArrays_EXERCISE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> userAndPointsMap = new LinkedHashMap<>();
        Map<String, Integer> languageCountMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String[] inputArr = input.split("-");
            String userName = inputArr[0];
            if (input.contains("banned")) {
                userAndPointsMap.remove(userName);
            } else {
                String language = inputArr[1];
                int points = Integer.parseInt(inputArr[2]);

                if (!userAndPointsMap.containsKey(userName)) {
                    userAndPointsMap.put(userName, points);
                } else {
                    int currentPoints = userAndPointsMap.get(userName);
                    if (points > currentPoints) {
                        userAndPointsMap.put(userName, points);
                    }
                }

                if (!languageCountMap.containsKey(language)) {
                    languageCountMap.put(language, 1);
                } else {
                    int currentCount = languageCountMap.get(language);
                    languageCountMap.put(language, currentCount + 1);
                }

            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userAndPointsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : languageCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
