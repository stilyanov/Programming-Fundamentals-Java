package Final_Exam_5;

import java.util.Scanner;

public class P01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawActivationKey = scanner.nextLine();


        String commands = scanner.nextLine();
        while (!commands.contains("Generate")) {
            if (commands.contains("Contains")) {
                //•	"Contains>>>{substring}":
                String substring = commands.split(">>>")[1];
                if (rawActivationKey.contains(substring)) {
                    System.out.printf("%s contains %s%n", rawActivationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (commands.contains("Flip")) {
                //•	"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                String upperOrLower = commands.split(">>>")[1];
                int startIndex = Integer.parseInt(commands.split(">>>")[2]);
                int endIndex = Integer.parseInt(commands.split(">>>")[3]);

                String substring = rawActivationKey.substring(startIndex, endIndex);

                if (upperOrLower.contains("Upper")) {
                    substring = substring.toUpperCase();
                } else {
                    substring = substring.toLowerCase();
                }
                StringBuilder builder = new StringBuilder(rawActivationKey);
                rawActivationKey = builder.replace(startIndex, endIndex, substring).toString();
                System.out.println(rawActivationKey);

            } else if (commands.contains("Slice")) {
                //•	"Slice>>>{startIndex}>>>{endIndex}":
                int startIndex = Integer.parseInt(commands.split(">>>")[1]);
                int endIndex = Integer.parseInt(commands.split(">>>")[2]);
                StringBuilder builder = new StringBuilder(rawActivationKey);
                rawActivationKey = builder.replace(startIndex, endIndex, "").toString();

                System.out.println(rawActivationKey);
            }
            commands = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", rawActivationKey);
    }
}
