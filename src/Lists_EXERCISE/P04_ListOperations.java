package Lists_EXERCISE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.startsWith("Add")) {
                //Add {number} - add number at the end
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberToAdd);
            } else if (command.startsWith("Insert")) {
                //· Insert {number} {index} - insert number at given index
                int number = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.startsWith("Remove")) {
                //· Remove {index} - remove that index
                int removeIndex = Integer.parseInt(command.split("\\s+")[1]);
                if (removeIndex >= 0 && removeIndex <= numbers.size() - 1) {
                    numbers.remove(removeIndex);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                //· Shift left {count} - first number becomes last 'count' times
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]);
                shiftLeft(numbers, countShiftLeft);
            } else if (command.contains("Shift right")) {
                //· Shift right {count} - last number becomes first 'count' times
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]);
                shiftRight(numbers, countShiftRight);
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void shiftRight(List<Integer> numbers, int countShiftRight) {
        for (int i = 1; i <= countShiftRight; i++) {
            int lastNumber = numbers.get(numbers.size() - 1);
            numbers.remove(numbers.size() - 1);
            numbers.add(0, lastNumber);
        }
    }

    public static void shiftLeft(List<Integer> numbers, int countShiftLeft) {
        for (int i = 1; i <= countShiftLeft; i++) {
            int firstNum = numbers.get(0);
            numbers.remove(0);
            numbers.add(firstNum);
        }
    }
}
