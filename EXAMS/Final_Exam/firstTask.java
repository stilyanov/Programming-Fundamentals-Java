package Final_Exam;

import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            if (commands.contains("Translate")) {
                String symbol = commands.split("\\s+")[1];
                String replacement = commands.split("\\s+")[2];
                text = text.replace(symbol, replacement);

                System.out.println(text);

            } else if (commands.contains("Includes")) {
                String substring = commands.split("\\s+")[1];
                if (text.contains(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (commands.contains("Start")) {
                String substring = commands.split("\\s+")[1];
                if (text.startsWith(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (commands.contains("Lowercase")) {
                text = text.toLowerCase();

                System.out.println(text);

            } else if (commands.contains("FindIndex")) {
                String symbol = commands.split("\\s+")[1];
                int lastOccurrence = text.lastIndexOf(symbol);


                System.out.println(lastOccurrence);

            } else if (commands.contains("Remove")) {
                int startIndex = Integer.parseInt(commands.split("\\s+")[1]);
                int count = Integer.parseInt(commands.split("\\s+")[2]);

                text = new StringBuilder(text).delete(startIndex, count + startIndex).toString();

                System.out.println(text);
            }


            commands = scanner.nextLine();
        }
    }
}
