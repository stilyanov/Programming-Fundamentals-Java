package EXAMS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersArr = new java.util.ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList());

        int sum = 0;

        for (Integer integer : numbersArr) {
            sum += integer;
        }
        double average = sum * 1.0 / numbersArr.size();
        numbersArr.sort(Collections.reverseOrder());

        int count = 0;
        for (int i = 0; i < numbersArr.size(); i++) {
            if (numbersArr.get(i) > average) {
                count++;
                System.out.printf("%d ", numbersArr.get(i));
            } else if (i == numbersArr.size() - 1 && count == 0) {
                System.out.println("No");
            }
            if (count == 5) {
                break;
            }
        }
    }
}
