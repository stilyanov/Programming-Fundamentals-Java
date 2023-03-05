package OrderByAge;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String dataInput = scanner.nextLine();
        while (!dataInput.equals("End")) {
            String[] data = dataInput.split(" ");
            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);

            Person person = new Person(name, id, age);
            personList.add(person);

            dataInput = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getId(), person.getAge());
        }
    }
}
