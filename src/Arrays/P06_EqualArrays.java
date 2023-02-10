package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isEqual = false;
        int difference = 0;

        for (int i = 0; i < firstArr.length; i++) {
            int firstArrElement = firstArr[i];
            int secondArrElement = secondArr[i];

            if (firstArrElement == secondArrElement) {
                sum += firstArrElement;
                isEqual = true;
            } else {
                isEqual = false;
                difference = i;
                break;
            }
        }
        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", difference);
        }
    }
}
