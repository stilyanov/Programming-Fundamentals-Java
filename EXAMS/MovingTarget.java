package EXAMS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String commandType = command.split("\\s+")[0];
            int index = Integer.parseInt(command.split("\\s+")[1]);

            switch (commandType) {
                case "Shoot":
                    //"Shoot {index} {power}"
                    int power = Integer.parseInt(command.split("\\s+")[2]);
                    shoot(targetsList, index, power);
                    break;

                case "Add":
                    //"Add {index} {value}"
                    int value = Integer.parseInt(command.split("\\s+")[2]);
                    add(targetsList, index, value);
                    break;

                case "Strike":
                    //"Add {index} {value}"
                    int radius = Integer.parseInt(command.split("\\s+")[2]);
                    strike(targetsList, index, radius);
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println(targetsList.stream().map(String::valueOf).collect(Collectors.joining("|")));
    }

    private static void strike(List<Integer> targetsList, int index, int radius) {
        if (index >= 0 && index < targetsList.size() && index + radius < targetsList.size() && index - radius >= 0) {
            int rotation = radius + radius + 1;
            for (int i = 0; i < rotation; i++) {
                targetsList.remove(index - radius);
            }
        } else {
            System.out.println("Strike missed!");
        }
    }

    private static void add(List<Integer> targetsList, int index, int value) {
        if (index >= 0 && index < targetsList.size()) {
            targetsList.add(index, value);
        } else {
            System.out.println("Invalid placement!");
        }
    }

    private static void shoot(List<Integer> targetsList, int index, int power) {
        if (index >= 0 && index < targetsList.size()) {
            int valueToReduce = targetsList.get(index);
            int newValue = valueToReduce - power; // 110 - 10  = 100
            targetsList.set(index, newValue);

            if (newValue <= 0) {
                targetsList.remove(index);
            }
        }
    }
}