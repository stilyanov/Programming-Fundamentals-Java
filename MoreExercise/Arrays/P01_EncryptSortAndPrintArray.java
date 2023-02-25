package Arrays_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scanner.nextLine());

        int[] sumNumbers = new int[numberOfStrings];

        int sumVowels = 0;
        int sumConsonant = 0;
        int total = 0;

        for (int i = 0; i < numberOfStrings; i++) {
            char[] letter = scanner.nextLine().toCharArray();
            for (char let : letter) {
                if (let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u' || let == 'A' || let == 'E' || let == 'I' || let == 'O' || let == 'U') {
                    sumVowels += let * letter.length;
                } else {
                    sumConsonant += let / letter.length;
                }
                total = sumVowels + sumConsonant;
            }
            sumVowels = 0;
            sumConsonant = 0;
//            System.out.println(total);
            sumNumbers[i] = total;

        }
        Arrays.sort(sumNumbers);
        for (int element : sumNumbers) {
            System.out.println(element);
        }
    }
}
