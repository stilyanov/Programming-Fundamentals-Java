package AssociativeArrays_EXERCISE;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P01_CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();

        LinkedHashMap<Character, Integer> letterMap = new LinkedHashMap<>();

        for (char symbol : words.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            letterMap.putIfAbsent(symbol, 0);
            int value = letterMap.get(symbol);
            letterMap.put(symbol, value + 1);
        }
        letterMap.forEach((character, integer) -> System.out.println(character + " -> " + integer));
    }
}
