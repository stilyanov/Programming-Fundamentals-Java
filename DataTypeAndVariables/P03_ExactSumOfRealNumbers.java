package DataTypeAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < number; i++) {
            BigDecimal newNumber = new BigDecimal(scanner.nextLine());

            sum = sum.add(newNumber);
        }
        System.out.println(sum);
    }
}
