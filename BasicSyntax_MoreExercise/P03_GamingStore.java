package BasicSyntax_MoreExercise;

import java.util.Scanner;

public class P03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double spendMoney = 0;

        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {
            if (input.equals("OutFall 4")) {
                if (currentBalance < 39.99) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 39.99;
                    spendMoney += 39.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else if (input.equals("CS: OG")) {
                if (currentBalance < 15.99) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 15.99;
                    spendMoney += 15.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else if (input.equals("Zplinter Zell")) {
                if (currentBalance < 19.99) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 19.99;
                    spendMoney += 19.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else if (input.equals("Honored 2")) {
                if (currentBalance < 59.99) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 59.99;
                    spendMoney += 59.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else if (input.equals("RoverWatch")) {
                if (currentBalance < 29.99) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 29.99;
                    spendMoney += 29.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else if (input.equals("RoverWatch Origins Edition")) {
                if (currentBalance < 39.99) {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                } else {
                    currentBalance -= 39.99;
                    spendMoney += 39.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else {
                System.out.println("Not Found");
                input = scanner.nextLine();
                continue;
            }
            if (currentBalance <= 0) {
                System.out.println("Out of money!");
                break;
            }
            input = scanner.nextLine();
        }
        if (currentBalance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spendMoney, currentBalance);
        }
    }
}
