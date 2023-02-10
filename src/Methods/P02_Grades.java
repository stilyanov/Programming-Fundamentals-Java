package Methods;

import java.util.Scanner;

public class P02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradeInput = Double.parseDouble(scanner.nextLine());

        printGradeInWord(gradeInput);
    }

    public static void printGradeInWord(double grade) {
        String word = "";
        if (grade <= 2.99) {
            word = "Fail";
        } else if (grade <= 3.49) {
            word = "Poor";
        } else if (grade <= 4.49) {
            word = "Good";
        } else if (grade <= 5.49) {
            word = "Very good";
        } else if (grade <= 6.00) {
            word = "Excellent";
        }
        System.out.println(word);
    }
}
