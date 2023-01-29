package Arrays_EXERCISE;

import java.util.Arrays;
import java.util.Scanner;

public class P03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            String[] nextNum = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArray[i] = Integer.parseInt(nextNum[0]);
                secondArray[i] = Integer.parseInt(nextNum[1]);
            } else {
                firstArray[i] = Integer.parseInt(nextNum[1]);
                secondArray[i] = Integer.parseInt(nextNum[0]);
            }
        }
//        for (int i = 0; i < firstArray.length; i++) {
//            System.out.print(firstArray[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < secondArray.length; i++) {
//            System.out.print(secondArray[i] + " ");
//        }

        for (int firstElements : firstArray) {
            System.out.print(firstElements + " ");
        }
        System.out.println();
        for (int secondElements : secondArray) {
            System.out.print(secondElements + " ");
        }
    }
}
