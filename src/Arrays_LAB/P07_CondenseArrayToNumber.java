package Arrays_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class P07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] condensed = new int[numbersArr.length - 1];

        for (int i = 0; i < numbersArr.length; i++) {
            int currentElement = numbersArr[i];

        }
    }
}
