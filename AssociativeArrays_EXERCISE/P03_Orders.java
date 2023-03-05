package AssociativeArrays_EXERCISE;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> quantityMap = new LinkedHashMap<>();
        Map<String, Double> priceMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            //Beer 2.20 100
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (!quantityMap.containsKey(product)) {
                quantityMap.put(product, quantity);
            } else {
                int currentQuantity = quantityMap.get(product);
                quantityMap.put(product, currentQuantity + quantity);
            }

            priceMap.put(product, price);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            String productName = entry.getKey();
            double price = priceMap.get(productName);
            int quantity = quantityMap.get(productName);
            System.out.printf("%s -> %.2f%n", productName, price * quantity);
        }
    }
}
