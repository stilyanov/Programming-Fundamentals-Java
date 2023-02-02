package Methods_LAB;

import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        printSum(product, amount);
    }
    public static double productPrice(String product) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = 1.5;
                break;
            case "water":
                price = 1;
                break;
            case "coke":
                price = 1.4;
                break;
            case "snacks":
                price = 2;
                break;
        }
        return price;
    }

    public static double totalSum(String product, int quantity) {
        double amount = productPrice(product);
        return amount * quantity;
    }

    public static void printSum(String product, int quantity) {
        double sum = totalSum(product, quantity);
        System.out.printf("%.2f", sum);
    }
}
