package AssociativeArrays_EXERCISE;

import java.util.*;

public class P05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> courseMap = new LinkedHashMap<>();


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            //{courseName} : {studentName}
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courseMap.containsKey(courseName)) {
                courseMap.put(courseName, new ArrayList<>());
            }
            courseMap.get(courseName).add(studentName);

            input = scanner.nextLine();
        }
        courseMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        });

    }
}
