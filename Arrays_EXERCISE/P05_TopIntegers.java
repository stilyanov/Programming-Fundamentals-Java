package Arrays_EXERCISE;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (maxNum < array[j]) {
                    maxNum = array[j];
                }
            }
            if (i == array.length - 1) {
                System.out.print(currentNumber);
            } else if (currentNumber > maxNum) {
                System.out.print(currentNumber + " ");
            }
            maxNum = 0;
        }
    }
}
