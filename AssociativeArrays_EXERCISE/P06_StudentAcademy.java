package AssociativeArrays_EXERCISE;

import java.util.*;

public class P06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> studentGradeMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGradeMap.containsKey(studentName)) {
                studentGradeMap.put(studentName, new ArrayList<>());
            }
            studentGradeMap.get(studentName).add(grade);
        }

        LinkedHashMap<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGradeMap.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);
            if (averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }
        studentAverageGrade.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));
    }

    public static double getAverageGrade(List<Double> studentList) {
        double sum = 0;
        for (double grade : studentList) {
            sum += grade;
        }
        return sum / studentList.size();
    }
}
