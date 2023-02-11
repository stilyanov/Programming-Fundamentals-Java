package Lists_EXERCISE;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.startsWith("Delete")) {
                //Delete {element} - delete all elements in the array which are equal to the given element
                int elementToDelete = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Collections.singleton(elementToDelete));
            } else if (command.startsWith("Insert")) {
                //Insert {element} {position} - insert element at the given position
                int elementToInsert = Integer.parseInt(command.split(" ")[1]);
                int positionIndex = Integer.parseInt(command.split(" ")[2]);
                numbers.add(positionIndex, elementToInsert);
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
