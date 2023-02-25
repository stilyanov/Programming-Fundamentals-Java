package EXAMS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceriesList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
            if (command.contains("Urgent")) {
                //"Urgent {item}" - add the item at the start of the list. If the item already exists, skip this command.
                String item = command.split(" ")[1];
                if (!groceriesList.contains(item)) {
                    groceriesList.add(0, item);
                }

            } else if (command.contains("Unnecessary")) {
                //"Unnecessary {item}" - remove the item with the given name, only if it exists in the list. Otherwise, skip this command.
                String item = command.split(" ")[1];
                if (groceriesList.contains(item)) {
                    groceriesList.remove(item);
                }
            } else if (command.contains("Correct")) {
                //"Correct {oldItem} {newItem}" - if the item with the given old name exists,
                // change its name with the new one. Otherwise, skip this command.
                String oldItem = command.split(" ")[1];
                String newItem = command.split(" ")[2];
                if (groceriesList.contains(oldItem)) {
                    groceriesList.set(groceriesList.indexOf(oldItem), newItem);
                }

            } else if (command.contains("Rearrange")) {
                //"Rearrange {item}" - if the grocery exists in the list,
                // remove it from its current position and add it at the end of the list. Otherwise, skip this command.
                String item = command.split(" ")[1];
                if (groceriesList.contains(item)) {
                    groceriesList.remove(item);
                    groceriesList.add(item);
                }
            }


            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", groceriesList));
    }
}
