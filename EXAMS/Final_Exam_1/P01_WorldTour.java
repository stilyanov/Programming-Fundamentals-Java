package Final_Exam_1;

import java.util.Scanner;

public class P01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder(input);


        String[] commandParts = scanner.nextLine().split(":");
        while (!commandParts[0].equals("Travel")) {
            String command = commandParts[0];

            if (command.contains("Add")) {
                //•	"Add Stop:{index}:{string}":
                //Insert the given string at that index only if the index is valid
                int index = Integer.parseInt(commandParts[1]);
                String text = commandParts[2];
                if (index >= 0 && index < builder.length()) {
                    builder.insert(index, text);
                }
                System.out.println(builder);

            } else if (command.contains("Remove")) {
                //•	"Remove Stop:{start_index}:{end_index}":
                //Remove the elements of the string from the starting index to the end index (inclusive) if both indices are valid
                int startIndex = Integer.parseInt(commandParts[1]);
                int endIndex = Integer.parseInt(commandParts[2]);
                if (startIndex >= 0 && endIndex >= 0 && startIndex < builder.length() && endIndex < builder.length()) {
                    builder.delete(startIndex, endIndex + 1);
                }
                System.out.println(builder);

            } else if (command.contains("Switch")) {
                //•	"Switch:{old_string}:{new_string}":
                //If the old string is in the initial string, replace it with the new one (all occurrences)
                String oldString = commandParts[1];
                String newString = commandParts[2];
                builder.replace(builder.indexOf(oldString), builder.indexOf(oldString) + oldString.length(), newString);
                System.out.println(builder);
            }

            commandParts = scanner.nextLine().split(":");
        }
        System.out.println("Ready for world tour! Planned stops: " + builder);
    }
}
