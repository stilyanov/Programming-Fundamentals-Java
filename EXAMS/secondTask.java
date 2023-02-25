package EXAMS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class secondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            if (command.startsWith("Add")) {
                //Add {value}
                int valueToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(valueToAdd);

            } else if (command.startsWith("Remove")) {
                //Remove {value}
                int valueToRemove = Integer.parseInt(command.split(" ")[1]);
                valueToRemove(numbers, valueToRemove);

            } else if (command.startsWith("Replace")) {
                //Replace {value} {replacement}
                int valueToReplace = Integer.parseInt(command.split(" ")[1]);
                int replacement = Integer.parseInt(command.split(" ")[2]);
                replaceValue(numbers, valueToReplace, replacement);


            } else if (command.startsWith("Collapse")) {
                //Collapse {value}
                int valueToCollapse = Integer.parseInt(command.split(" ")[1]);
                collapseValue(numbers, valueToCollapse);

            }
            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void collapseValue(List<Integer> numbers, int valueToCollapse) {
        for (int i = 0; i <= numbers.size() - 1; i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber < valueToCollapse) {
                numbers.removeAll(Collections.singleton(currentNumber));
            }
        }
    }

    private static void replaceValue(List<Integer> numbers, int valueToReplace, int replacement) {
        for (int i = 0; i <= numbers.size() - 1; i++) {
            int currentElement = numbers.get(i);
            if (currentElement == valueToReplace) {
                int index = numbers.indexOf(valueToReplace);
                numbers.set(index, replacement);
                break;
            }
        }
    }

    private static void valueToRemove(List<Integer> numbers, int valueToRemove) {
        for (int i = 0; i <= numbers.size() - 1; i++) {
            int currentElement = numbers.get(i);
            if (currentElement == valueToRemove) {
                numbers.remove((Integer) valueToRemove);
                break;
            }
        }
    }
}
