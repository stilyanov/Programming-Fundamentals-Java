package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> finalList = new ArrayList<>();

        int minSize = Math.min(numbers1.size(), numbers2.size());
        for (int i = 0; i < minSize; i++) {
            int numFirstList = numbers1.get(i);
            int numSecondList = numbers2.get(i);

            finalList.add(numFirstList);
            finalList.add(numSecondList);
        }
        if (numbers1.size() > numbers2.size()) {
            finalList.addAll(numbers1.subList(minSize, numbers1.size()));
        } else if (numbers2.size() > numbers1.size()) {
            finalList.addAll(numbers2.subList(minSize, numbers2.size()));
        }
        for (int number :finalList) {
            System.out.print(number + " ");
        }
    }
}
