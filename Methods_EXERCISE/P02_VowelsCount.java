package Methods_EXERCISE;

import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        printVowelsCount(textInput);
    }

    public static void printVowelsCount(String text) {
        int count = 0;
        for (char vowels : text.toLowerCase().toCharArray()) {
            if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
