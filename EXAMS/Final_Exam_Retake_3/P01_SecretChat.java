package Final_Exam_Retake_3;

import java.util.Scanner;

public class P01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();
        StringBuilder builder = new StringBuilder(concealedMessage);

        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            if (command.contains("InsertSpace")) {
                //•	"InsertSpace:|:{index}":
                int index = Integer.parseInt(command.split(":\\|:")[1]);
                builder.insert(index, " ");
                System.out.println(builder);

            } else if (command.contains("Reverse")) {
                //•	"Reverse:|:{substring}":
                String subString = command.split(":\\|:")[1];

                if (builder.toString().contains(subString)) {
                    String reversed = new StringBuilder(subString).reverse().toString();
                    int firstIndex = builder.indexOf(subString);
                    int lastIndex = firstIndex + (subString.length());

                    builder.replace(firstIndex, lastIndex, "");
                    builder.append(reversed);
                    System.out.println(builder);
                } else {
                    System.out.println("error");
                }

            } else if (command.contains("ChangeAll")) {
                //•	"ChangeAll:|:{substring}:|:{replacement}":
                String subString = command.split(":\\|:")[1];
                String replacement = command.split(":\\|:")[2];
                concealedMessage = concealedMessage.replace(subString, replacement);
                StringBuilder stringBuilder = new StringBuilder(concealedMessage);
                builder = stringBuilder;

                System.out.println(builder);
            }
            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + builder);
    }
}
