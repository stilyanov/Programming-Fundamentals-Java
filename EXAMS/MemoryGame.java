package EXAMS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        // 1 1 2 2 3 3 4 4 5 5
        // 1 0


        String command = scanner.nextLine();
        int count = 0;

        while (!command.equals("end")) {
            count++;
            int firstIndex = Integer.parseInt(command.split(" ")[0]);   // 1
            int secondIndex = Integer.parseInt(command.split(" ")[1]);  // 0

            if (cheat(firstIndex, secondIndex, elements)) {
                System.out.println("Invalid input! Adding additional elements to the board");
                int middle = elements.size() / 2;
                elements.add(middle, String.format("-%da", count));
                elements.add(middle, String.format("-%da", count));
            } else {
                String firstElement = elements.get(firstIndex);
                String secondElement = elements.get(secondIndex);

                if (firstElement.equals(secondElement)) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", firstElement);
                    elements.remove(firstElement);
                    elements.remove(secondElement);
                } else {
                    System.out.println("Try again!");
                }
            }
            if (elements.isEmpty()) {
                break;
            }

            command = scanner.nextLine();
        }

        if (elements.isEmpty()) {
            System.out.printf("You have won in %d turns!", count);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", elements));
        }
    }

    public static boolean cheat(int firstIndex, int secondIndex, List<String> elements) {
        return firstIndex == secondIndex || outOfBounds(firstIndex, elements) || outOfBounds(secondIndex, elements);

    }

    public static boolean outOfBounds(int index, List<String> elements) {
        return index < 0 || index >= elements.size();
    }
}
