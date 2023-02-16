package EXAMS;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceWithoutTaxes = 0;
        double taxes = 0;
        double totalPrice = 0;

        String input = scanner.nextLine();
        while (!input.equals("special") && !input.equals("regular")) {
            double parts = Double.parseDouble(input);
            if (parts > 0) {
                priceWithoutTaxes += parts;
            } else {
                System.out.println("Invalid price!");
            }
            input = scanner.nextLine();
        }
        taxes = priceWithoutTaxes * 0.2;
        totalPrice = priceWithoutTaxes + taxes;

        if (input.equals("special")) {
            totalPrice = totalPrice * 0.9;
        }

        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.printf("Congratulations you've just bought a new computer!%n");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.printf("-----------%n");
            System.out.printf("Total price: %.2f$", totalPrice);
        }
    }
}
