package DataTypeAndVariables;

import java.util.Scanner;

public class P10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int specialNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= specialNumber; i++) {
            int currentNum = i;
            int sum = 0;

            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;

            if (isSpecial) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);

            }
        }
    }
}
