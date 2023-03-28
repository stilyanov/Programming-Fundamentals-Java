package Final_Exam_5;

import java.util.*;

public class P03_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> citiesMap = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("Sail")) {
            //Tortuga||345000||1250
            //Santo Domingo||240000||630
            //Havana||410000||1100
            String city = command.split("\\|\\|")[0];
            int population = Integer.parseInt(command.split("\\|\\|")[1]);
            int gold = Integer.parseInt(command.split("\\|\\|")[2]);

            if (!citiesMap.containsKey(city)) {
                citiesMap.put(city, new ArrayList<>());
                citiesMap.get(city).add(0, population);
                citiesMap.get(city).add(1, gold);

            } else {
                int currentPopulation = citiesMap.get(city).get(0);
                int currentGold = citiesMap.get(city).get(1);
                citiesMap.get(city).set(0, currentPopulation + population);
                citiesMap.get(city).set(1, currentGold + gold);
            }
            command = scanner.nextLine();
        }

        String events = scanner.nextLine();
        while (!events.equals("End")) {
            if (events.contains("Plunder")) {
                //•	"Plunder=>{town}=>{people}=>{gold}"
                String town = events.split("=>")[1];
                int people = Integer.parseInt(events.split("=>")[2]);
                int gold = Integer.parseInt(events.split("=>")[3]);

                int currentPeople = citiesMap.get(town).get(0);
                int currentGold = citiesMap.get(town).get(1);

                citiesMap.get(town).set(0, currentPeople - people);
                citiesMap.get(town).set(1, currentGold - gold);
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);

                if (citiesMap.get(town).get(0) <= 0 || citiesMap.get(town).get(1) <= 0) {
                    citiesMap.remove(town);
                    System.out.println(town + " has been wiped off the map!");
                }


            } else if (events.contains("Prosper")) {
                //•	"Prosper=>{town}=>{gold}"
                String town = events.split("=>")[1];
                int gold = Integer.parseInt(events.split("=>")[2]);

                int currentGold = citiesMap.get(town).get(1);

                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    citiesMap.get(town).set(1, currentGold + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, currentGold + gold);
                }
            }

            events = scanner.nextLine();
        }

        if (!citiesMap.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", citiesMap.size());

            citiesMap.forEach((key, value) -> {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", key, value.get(0), value.get(1));
            });

        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
