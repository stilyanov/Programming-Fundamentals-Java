package Arrays_EXERCISE;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                int nextNum = numbers[j];

                if (currentNum + nextNum == magicNum) {
                    System.out.println(currentNum + " " + nextNum);
                }
            }
        }
    }
}
