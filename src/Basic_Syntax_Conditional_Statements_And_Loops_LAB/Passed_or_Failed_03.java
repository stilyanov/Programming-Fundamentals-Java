package Basic_Syntax_Conditional_Statements_And_Loops_LAB;

import java.util.Scanner;

public class Passed_or_Failed_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3.00) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
