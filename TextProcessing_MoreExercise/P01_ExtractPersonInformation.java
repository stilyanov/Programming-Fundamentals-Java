package TextProcessing_MoreExercise;

import java.util.Scanner;

public class P01_ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String text = scanner.nextLine();
            int firstIndexName = text.lastIndexOf("@");
            int lastIndexName = text.lastIndexOf("|");

            String name = text.substring(firstIndexName + 1, lastIndexName);

            int firstIndexAge = text.lastIndexOf("#");
            int lastIndexAge = text.lastIndexOf("*");

            String age = text.substring(firstIndexAge + 1, lastIndexAge);

            System.out.println(name + " is " + age + " years old.");
        }
    }
}
