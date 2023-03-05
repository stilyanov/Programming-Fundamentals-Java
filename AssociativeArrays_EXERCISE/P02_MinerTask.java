package AssociativeArrays_EXERCISE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourceMap = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resourceMap.containsKey(resource)) {
                resourceMap.put(resource, quantity);
            } else {
                int addQuantity = resourceMap.get(resource);
                resourceMap.put(resource, addQuantity + quantity);
            }

            command = scanner.nextLine();
        }
        resourceMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
