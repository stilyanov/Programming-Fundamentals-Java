package Arrays_EXERCISE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class P10_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chestLoot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        List<String> commandList = Arrays.asList(scanner.nextLine().split(" "));

        while (!commandList.get(0).equals("Yohoho!")) {
            //Loot {item1} {item2}…{itemn}
            //Drop {index}
            //Steal {count}:
            String command = commandList.get(0);

            switch (command) {
                case "Loot":
                    List<String> loots = commandList.subList(1, commandList.size());
                    for (String item : loots) {
                        if (!chestLoot.contains(item)) {
                            chestLoot.add(0, item);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandList.get(1));
                    if (index > 0 && index < chestLoot.size()) {
                        String removedItem = chestLoot.get(index);
                        chestLoot.remove(removedItem);
                        chestLoot.add(removedItem);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandList.get(1));
                    int result = chestLoot.size() - count;
                    List<String> stealLoot = new ArrayList<>();
                    if (result >= 0) {
                        for (int i = result; i < chestLoot.size(); i++) {
                            String item = chestLoot.remove(i--);
                            stealLoot.add(item);
                        }
                    } else {
                        for (int i = 0; i < chestLoot.size(); i++) {
                            String item = chestLoot.remove(i--);
                            stealLoot.add(item);
                        }
                    }
                    System.out.println(String.join(", ", stealLoot));
                    break;
            }


            commandList = Arrays.asList(scanner.nextLine().split(" "));
        }
        if (chestLoot.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sum = 0;
            for (String item:chestLoot) {
                sum = sum + item.length();
            }

            double avgGain = sum / chestLoot.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", avgGain);
        }
    }
}
