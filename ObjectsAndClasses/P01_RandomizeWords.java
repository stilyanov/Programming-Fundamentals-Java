package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class P01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        String[] wordsArray = words.split("\\s+");

        Random random = new Random();

        for (int i = 0; i < wordsArray.length; i++) {
            int index1 = random.nextInt(wordsArray.length);
            int index2 = random.nextInt(wordsArray.length);

            String oldIndex1 = wordsArray[index1];
            wordsArray[index1] = wordsArray[index2];
            wordsArray[index2] = oldIndex1;
        }
        System.out.println(String.join(System.lineSeparator(), wordsArray));
    }
}
