package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            int firstNumLastNum = numbers.get(i) + numbers.get(numbers.size() - 1);
            numbers.set(i, firstNumLastNum);
            numbers.remove(numbers.size() - 1);
        }
//        System.out.println(numbers.toString().replace("[", ""). replace("]", ""). replace(",", ""));
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
