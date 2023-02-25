package ObjectsAndClasses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2_0 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] data = command.split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String homeTown = data[3];

            if (isStudentExisting(studentList, firstName, lastName)) {
                int index = getExistingIndex(studentList, firstName, lastName);
                studentList.get(index).setAge(age);
                studentList.get(index).setHomeTown(homeTown);
            } else {
                Student currentStudent = new Student(firstName, lastName, age, homeTown);
                studentList.add(currentStudent);
            }

            command = scanner.nextLine();
        }

        String town = scanner.nextLine();

        for (Student student : studentList) {
            if (town.equals(student.getHomeTown())) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
    static boolean isStudentExisting(List<Student> studentList, String firstName, String lastName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
    public static int getExistingIndex (List<Student> studentList, String firstName, String lastName) {
        int index = -1;

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                index = i;
            }
        }
        return index;
    }
}
