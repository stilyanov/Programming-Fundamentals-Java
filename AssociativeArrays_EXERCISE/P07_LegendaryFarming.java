package AssociativeArrays_EXERCISE;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> materialsMap = new LinkedHashMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);

        LinkedHashMap<String, Integer> junksMap = new LinkedHashMap<>();

        boolean isWin = false;
        while (!isWin) {
            String[] inputData = scanner.nextLine().split("\\s+");

            for (int i = 0; i <= inputData.length - 1; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materialsMap.get(material);
                    materialsMap.put(material, currentQuantity + quantity);
                } else {
                    if (!junksMap.containsKey(material)) {
                        junksMap.put(material, quantity);
                    } else {
                        int currentQuantity = junksMap.get(material);
                        junksMap.put(material, currentQuantity + quantity);
                    }
                }

                if (materialsMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    int currentQuantity = materialsMap.get(material);
                    materialsMap.put("shards", currentQuantity - 250);
                    isWin = true;
                    break;
                } else if (materialsMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    int currentQuantity = materialsMap.get(material);
                    materialsMap.put("fragments", currentQuantity - 250);
                    isWin = true;
                    break;
                } else if (materialsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    int currentQuantity = materialsMap.get(material);
                    materialsMap.put("motes", currentQuantity - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        materialsMap.forEach((key, value) -> System.out.println(key + ": " + value));
        junksMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
