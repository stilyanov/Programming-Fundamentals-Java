package TextProcessing_MoreExercise;

import java.util.Scanner;

public class P02_AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();

        int sum = 0;

        for (int index = 0; index < text.length(); index++) {
            if (firstSymbol > text.charAt(index) && secondSymbol < text.charAt(index) ||
            secondSymbol > text.charAt(index) && firstSymbol < text.charAt(index)) {
                sum += text.charAt(index);
            }
        }
        System.out.println(sum);
    }
}
