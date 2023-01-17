package BasicSyntax_EXERCISE;

import java.util.Scanner;

public class Padawan_Equipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightSabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double totalCountStudents = countStudents + (countStudents * 0.90);
        //sabresPrice * (studentsCount + 10%) + robesPrice * (studentsCount) + beltsPrice * (studentsCount - freeBelts)
        double total = lightSabersPrice * (totalCountStudents) + robesPrice + (countStudents) + beltsPrice * (countStudents);
        System.out.println(total);
    }
}
