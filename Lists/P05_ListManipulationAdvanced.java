package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            if (command.contains("Contains")) {//Contains {number} – check if the list contains the number. If yes, print "Yes", otherwise, print "No such number"
                int containsNumber = Integer.parseInt(command.split(" ")[1]);
                printContains(numbers, containsNumber);
            } else if (command.equals("Print even")) {//Print even – print all the numbers that are even separated by a space
                printEven(numbers);
            } else if (command.equals("Print odd")) {//Print odd – print all the numbers that are oddly separated by a space
                printOdd(numbers);
            } else if (command.equals("Get sum")) {//Get sum – print the sum of all the numbers
                printSum(numbers);
            } else if (command.startsWith("Filter")) {
                //Filter {condition} {number} – print all the numbers that fulfill that condition.// The condition will be either '<', '>', ">=", "<="
                String condition = command.split(" ")[1];
                int numberToFulFill = Integer.parseInt(command.split(" ")[2]);
                printFilteredNumbers(numbers, condition, numberToFulFill);
            }
            command = scanner.nextLine();
        }
    }

    public static void printFilteredNumbers(List<Integer> numbers, String condition, int numberToFulFill) {
        switch (condition) {
            case "<":
                for (int number : numbers) {
                    if (number < numberToFulFill) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case ">":
                for (int number : numbers) {
                    if (number > numberToFulFill) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int number : numbers) {
                    if (number >= numberToFulFill) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int number : numbers) {
                    if (number <= numberToFulFill) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
        }
    }

    public static void printSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void printOdd(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void printEven(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void printContains(List<Integer> numbers, int containsNumber) {
        if (numbers.contains(containsNumber)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
}
