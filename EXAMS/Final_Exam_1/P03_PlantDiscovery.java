package Final_Exam_1;

import java.util.*;

public class P03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> rarityMap = new LinkedHashMap<>();
        LinkedHashMap<String, List<Double>> ratingMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String plant = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);
            rarityMap.putIfAbsent(plant, rarity);
            rarityMap.put(plant, rarity);
        }

        for (Map.Entry<String, Integer> entry : rarityMap.entrySet()) {
            String currentPlant = entry.getKey();
            ratingMap.put(currentPlant, new ArrayList<>());
        }

        //•	"Rate: {plant} - {rating}" – add the given rating to the plant (store all ratings)
        //•	"Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one
        //•	"Reset: {plant}" – remove all the ratings of the given plant
        String input = scanner.nextLine();
        while (!(input.equals("Exhibition"))) {

            String command = input.split(":")[0];
            String plant = input.split(":|-".trim())[1].replaceAll(" ", "");
            if (ratingMap.containsKey(plant)) {
                if (command.equals("Rate")) {
                    double rating = Double.parseDouble(input.split("-\\s+".trim())[1]);
                    ratingMap.get(plant).add(rating);
                } else if (command.equals("Update")) {
                    int newRarity = Integer.parseInt(input.split("-\\s+".trim())[1]);
                    rarityMap.put(plant, newRarity);
                } else if (command.equals("Reset")) {
                    ratingMap.put(plant, new ArrayList<>());
                }
            } else {
                System.out.println("error");
            }

            input = scanner.nextLine();
        }
        printResult(rarityMap, ratingMap);
    }

    private static void printResult(Map<String, Integer> rarityMap, Map<String, List<Double>> ratingMap) {

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> rarityEntry : rarityMap.entrySet()) {
            for (Map.Entry<String, List<Double>> ratingEntry : ratingMap.entrySet()) {
                if (ratingEntry.getKey().equals(rarityEntry.getKey())) {
                    double sum = 0;
                    for (Double currentRating : ratingEntry.getValue()) {
                        sum += currentRating;
                    }
                    sum /= ratingEntry.getValue().size();
                    if (sum != sum) {
                        sum = 0;
                    }
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", rarityEntry.getKey(), rarityEntry.getValue(), sum);
                    break;
                }
            }
        }
    }
}
