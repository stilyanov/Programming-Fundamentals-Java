package Lists_EXERCISE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String nextInput = scanner.nextLine();
        int bomb = Integer.parseInt(nextInput.split(" ")[0]);
        int power = Integer.parseInt(nextInput.split(" ")[1]);

        //1 2 2 4 2 2 2 9
        //4 2

        while (numbers.contains(bomb)) {
            int indexBomb = numbers.indexOf(bomb);
            int start = indexBomb - power;
            int end = indexBomb + power;
            if (start < 0) {
                start = 0;
            }
            if (end >= numbers.size() - 1) {
                end = numbers.size() - 1;
            }
            for (int i = start; i <= end; i++) {
                numbers.remove(start);
            }
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println(sum);
        }
    }
}
