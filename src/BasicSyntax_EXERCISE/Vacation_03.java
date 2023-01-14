package BasicSyntax_EXERCISE;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        if (dayOfWeek.equals("Friday")) {
            if (typeGroup.equals("Students")) {
                price = 8.45;
                if (people >= 30) {
                    price = price * 0.85;
                }
            } else if (typeGroup.equals("Business")) {
                price = 10.90;
                if (people >= 100) {
                    people -= 10;
                }
            } else if (typeGroup.equals("Regular")) {
                price = 15;
                if (people >= 10 && people <= 20) {
                    price = price * 0.95;
                }
            }
        } else if (dayOfWeek.equals("Saturday")) {
            if (typeGroup.equals("Students")) {
                price = 9.80;
                if (people >= 30) {
                    price = price * 0.85;
                }
            } else if (typeGroup.equals("Business")) {
                price = 15.60;
                if (people >= 100) {
                    people -= 10;
                }
            } else if (typeGroup.equals("Regular")) {
                price = 20;
                if (people >= 10 && people <= 20) {
                    price = price * 0.95;
                }
            }
        } else if (dayOfWeek.equals("Sunday")) {
            if (typeGroup.equals("Students")) {
                price = 10.46;
                if (people >= 30) {
                    price = price * 0.85;
                }
            } else if (typeGroup.equals("Business")) {
                price = 16;
                if (people >= 100) {
                    people -= 10;
                }
            } else if (typeGroup.equals("Regular")) {
                price = 22.50;
                if (people >= 10 && people <= 20) {
                    price = price * 0.95;
                }
            }
        }
        System.out.printf("Total price: %.2f", price * people);
    }
}
