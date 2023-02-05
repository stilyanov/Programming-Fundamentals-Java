package Methods_EXERCISE;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printCharactersInRange(firstSymbol, secondSymbol);
    }

    public static void printCharactersInRange(char symbol1, char symbol2) {
        if (symbol1 < symbol2) {
            for (char i = (char) (symbol1 + 1); i < symbol2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (symbol2 + 1); i < symbol1; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
