package EXAMS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        //10 20 30 40 50

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double averageNumber = sum * 1.0 / numbers.size();

        List<Integer> greaterElements = new ArrayList<>();
        for (int number : numbers) {
            if (number > averageNumber) {
                greaterElements.add(number);
            }
        }

        Collections.sort(greaterElements);
        Collections.reverse(greaterElements);

        if (greaterElements.size() > 0) {
            if (greaterElements.size() < 5) {

                System.out.println(greaterElements.toString()
                        .replace("[", "")
                        .replace("]", "")
                        .replace(",", "")
                );

            } else {

                List<Integer> top5Numbers = greaterElements.subList(0, 5);
                for (int number : top5Numbers) {
                    System.out.print(number + " ");
                }
            }

        } else {

            System.out.println("No");
        }
    }
}
