package Arrays_EXERCISE;

import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numberArray = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations; i++) {
            String firstElement = numberArray[0];

            for (int index = 0; index < numberArray.length - 1; index++) {
                numberArray[index] = numberArray[index + 1];
            }
            numberArray[numberArray.length - 1] = firstElement;
        }
        for (String element : numberArray) {
            System.out.print(element + " ");
        }
    }
}
