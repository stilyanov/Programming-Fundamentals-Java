package BasicSyntax_EXERCISE;

import java.util.Scanner;

public class Strong_Number_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int strongNum = number;

        int sumFact = 0;

        while (number > 0) {
            int lastNumber = number % 10; // вземам последната цифра от числото

            int fact = 1;
            for (int i = 1; i <= lastNumber; i++) {
                fact *= i;
            }
            sumFact += fact;
            number = number / 10; // махам последната цифта от числото за да мога да взема следващата му
        }
        if (strongNum == sumFact) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
