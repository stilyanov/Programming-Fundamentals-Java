package AssociativeArrays_EXERCISE;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class P09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> teamsMap = new LinkedHashMap<String, List<String>>();

        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {
            //"{force_side} | {force_user}"
            if (input.contains("|")) {
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];

                if (!teamsMap.containsKey(team)) {
                    teamsMap.put(team, new ArrayList<>());
                }

                boolean isExist = false;

                for (List<String> list : teamsMap.values()) {
                    if (list.contains(player)) {
                        isExist = true;
                    }
                }

                if (!isExist) {
                    teamsMap.get(team).add(player);
                }

            } else if (input.contains("->")) {
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];

                teamsMap.entrySet().forEach(entry -> entry.getValue().remove(player));

                if (teamsMap.containsKey(team)) {
                    List<String> currentPlayers = teamsMap.get(team);
                    currentPlayers.add(player);
                } else {
                    teamsMap.put(team, new ArrayList<>());
                    teamsMap.get(team).add(player);
                }

                System.out.printf("%s joins the %s side!%n", player, team);
            }
            input = scanner.nextLine();
        }

        teamsMap.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}
