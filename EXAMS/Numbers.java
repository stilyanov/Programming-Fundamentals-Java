package EXAMS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //10 20 30 40 50
        double averageNumber = 1;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        averageNumber = sum * 1.0 / numbers.size();
        Collections.sort(numbers);
        Collections.reverse(numbers);
        int count = 0;
        for (int number : numbers) {
            if (count == 5) {
                break;
            }
            count++;
            if (number > averageNumber) {
                System.out.print(number + " ");
            } else if (averageNumber == 1) {
                System.out.println("No");
            }
        }
    }
}
