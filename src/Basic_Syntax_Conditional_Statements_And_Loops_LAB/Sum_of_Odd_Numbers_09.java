package Basic_Syntax_Conditional_Statements_And_Loops_LAB;

import java.util.Scanner;

public class Sum_of_Odd_Numbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i < n * 2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
