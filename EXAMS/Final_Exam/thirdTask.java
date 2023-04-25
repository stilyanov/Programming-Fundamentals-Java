package Final_Exam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> animalsMap = new LinkedHashMap<>();
        LinkedHashMap<String, List<String>> areaMap = new LinkedHashMap<>();


        String commands = scanner.nextLine();
        while (!commands.equals("EndDay")) {
            if (commands.contains("Add")) {
                String animalName = commands.split("[: -]+")[1];
                int neededFood = Integer.parseInt(commands.split("[: -]+")[2]);
                String area = commands.split("[: -]+")[3];

                if (animalsMap.containsKey(animalName)) {
                    int currentFood = animalsMap.get(animalName);
                    animalsMap.put(animalName, currentFood + neededFood);
                } else {
                    animalsMap.putIfAbsent(animalName, neededFood);
                    animalsMap.put(animalName, neededFood);

                    areaMap.putIfAbsent(area, new ArrayList<>());
                    areaMap.get(area).add(animalName);
                }




            } else if (commands.contains("Feed")) {
                String animalName = commands.split("[: -]+")[1];
                int neededFood = Integer.parseInt(commands.split("[: -]+")[2]);

                if (animalsMap.containsKey(animalName)) {
                    int currentFood = animalsMap.get(animalName);
                    animalsMap.put(animalName, currentFood - neededFood);
                } else {
                    commands = scanner.nextLine();
                    continue;
                }

                int currentFood = animalsMap.get(animalName);
                if (currentFood <= 0) {
                    System.out.println(animalName + " was successfully fed");

                    animalsMap.remove(animalName);

                    areaMap.values().forEach(names -> names.remove(animalName));

                }
            }
            commands = scanner.nextLine();
        }

        System.out.println("Animals:");
        animalsMap.forEach((key, value) -> {
            System.out.println(" " + key + " -> " + value + "g");
        });
        System.out.println("Areas with hungry animals:");
        areaMap.forEach((key, value) -> {

            if (!value.isEmpty()) {
                System.out.println(" " + key + ": " + value.size());
            }
        });
    }
}
