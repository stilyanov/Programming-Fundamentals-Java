package ObjectsAndClasses.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] data = command.split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String homeTown = data[3];

            Student student = new Student(firstName,lastName,age,homeTown);
            studentList.add(student);

            command = scanner.nextLine();
        }

        String town = scanner.nextLine();

        for (Student student : studentList) {
            if (town.equals(student.getHomeTown())) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
