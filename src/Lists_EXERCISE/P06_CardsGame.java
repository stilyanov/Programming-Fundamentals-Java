package Lists_EXERCISE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayerCards.size() > 0 && secondPlayerCards.size() > 0) {

            if (firstPlayerCards.get(0) > secondPlayerCards.get(0)) {

                firstPlayerCards.add(firstPlayerCards.get(0));
                firstPlayerCards.add(secondPlayerCards.get(0));
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);

            } else if (secondPlayerCards.get(0) > firstPlayerCards.get(0)) {

                secondPlayerCards.add(secondPlayerCards.get(0));
                secondPlayerCards.add(firstPlayerCards.get(0));
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);

            } else {
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            }
        }
        int sum = 0;
        if (firstPlayerCards.size() == 0) {
            for (int card : secondPlayerCards) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (int card : firstPlayerCards) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
