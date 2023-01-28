package Arrays_EXERCISE;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstElements = scanner.nextLine().split(" ");
        String[] secondElements = scanner.nextLine().split(" ");

        for (String secondArray : secondElements) {
            for (String firstArray : firstElements) {
                if (secondArray.equals(firstArray)) {
                    System.out.print(firstArray + " ");
                    break;
                }
            }
        }
    }
}
