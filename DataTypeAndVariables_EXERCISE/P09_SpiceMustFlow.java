package DataTypeAndVariables_EXERCISE;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalAmount = 0;

        while (startingYield >= 100) {
            int spices = startingYield - 26;
            totalAmount += spices;
            days++;
            startingYield = startingYield - 10;
        }

        System.out.println(days);
        if (totalAmount >= 26) {
            totalAmount -= 26;
        }
        System.out.println(totalAmount);
    }
}
