import java.util.Arrays;
import java.util.Scanner;

public class P04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordArr = Arrays.stream(scanner.nextLine().split(" ")).filter(word -> word.length() % 2 == 0).toArray(String[]::new);

        for (String word : wordArr) {
            System.out.println(word);
        }

    }
}
