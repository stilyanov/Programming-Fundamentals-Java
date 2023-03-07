package AssociativeArrays_EXERCISE;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class P08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> listOfEmployeesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String companyName = input.split(" ->")[0];
            String id = input.split(" -> ")[1];

            List<String> currentEmployees = listOfEmployeesMap.get(companyName);
            boolean containsID = currentEmployees != null && currentEmployees.contains(id);

            if (!containsID) {
                listOfEmployeesMap.putIfAbsent(companyName, new ArrayList<>());
                listOfEmployeesMap.get(companyName).add(id);
            }
            input = scanner.nextLine();
        }
        listOfEmployeesMap.entrySet().stream().forEach(c -> {
            System.out.printf("%s%n", c.getKey());
            c.getValue().forEach(entry -> System.out.printf("-- %s%n", entry));
        });
    }
}
