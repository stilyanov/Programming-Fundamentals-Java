package EXAMS;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        //          [ 0, 0, 0, 0 ]
        for (int wagon = 0; wagon <= wagons.length - 1; wagon++) {
            if (peopleWaiting > 0) {
                int currentPeople = wagons[wagon];
                while (currentPeople < 4) {
                    if (peopleWaiting <= 0) {
                        break;
                    }
                    currentPeople++;
                    wagons[wagon] = currentPeople;
                    peopleWaiting--;
                }
            }
        }
        if (peopleWaiting <= 0 && wagons[wagons.length - 1] < 4) {
            System.out.println("The lift has empty spots!");
        } else if (peopleWaiting > 0 && wagons[wagons.length - 1] >= 4) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
        }

        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
