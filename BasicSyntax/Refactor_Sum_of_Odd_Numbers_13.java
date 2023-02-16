package BasicSyntax;

import java.util.Scanner;

public class Refactor_Sum_of_Odd_Numbers_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 1;

        for (int i = 1; i < n * 2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("Sum: %d%n", sum - 1);
    }
}
