package TextProcessing;

import java.util.Scanner;

public class P03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toReplace = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(toReplace);
        while (index != -1) {
            text = text.replace(toReplace, "");

            index = text.indexOf(toReplace);
        }
        System.out.println(text);
    }
}
