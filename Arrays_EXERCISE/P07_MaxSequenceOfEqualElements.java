package Arrays_EXERCISE;

import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int counter = 1;
        int bestLength = 0;
        int digit = 0;

        for (int index = 1; index < numberArray.length; index++) {

            if (numberArray[index] == numberArray[index - 1]) {
                counter++;

                if (counter > bestLength) {
                    bestLength = counter;
                    digit = numberArray[index];
                }
            } else {
                counter = 1;
            }
        }
        for (int i = 0; i < bestLength; i++) {
            System.out.print(digit + " ");
        }
    }
}
