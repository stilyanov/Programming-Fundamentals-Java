package BasicSyntax_LAB;

import java.util.Scanner;

public class Student_Information_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        String output = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade);

        System.out.println(output);
    }
}
