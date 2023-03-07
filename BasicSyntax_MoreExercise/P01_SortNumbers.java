package BasicSyntax_MoreExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(firstNumber);
        numbersList.add(secondNumber);
        numbersList.add(thirdNumber);
        Collections.sort(numbersList);
        Collections.reverse(numbersList);

        for (int number : numbersList) {
            System.out.println(number);
        }
    }
}
