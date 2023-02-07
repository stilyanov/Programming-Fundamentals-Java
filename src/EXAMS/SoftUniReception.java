package EXAMS;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int neededHours = 0;

        int answerPerHour = firstEmployee + secondEmployee + thirdEmployee;

        while (studentsCount > 0) {
            studentsCount -= answerPerHour;
            neededHours++;

            if (neededHours % 4 == 0) {
                neededHours++;
            }
        }
        System.out.printf("Time needed: %dh.", neededHours);
    }
}
