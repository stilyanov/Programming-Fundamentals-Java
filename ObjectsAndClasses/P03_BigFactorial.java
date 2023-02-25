package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class P03_BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInRange = Integer.parseInt(scanner.nextLine());

        BigInteger total = new BigInteger(String.valueOf(1));

        for (int factorial = 1; factorial <= numberInRange; factorial++) {
            total = total.multiply(BigInteger.valueOf(factorial));
        }
        System.out.println(total);
    }
}
