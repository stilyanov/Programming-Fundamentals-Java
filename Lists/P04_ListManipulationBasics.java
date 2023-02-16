package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Add")) {  //Add {number}
                int elementToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(elementToAdd);
            } else if (command.contains("RemoveAt")) {  //RemoveAt {index}
                int removeIndex = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(removeIndex);
            } else if (command.contains("Remove")) {   //Remove {number}
                int removeElement = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(removeElement));
            } else if (command.contains("Insert")) {    //Insert {number} {index}
                String[] commandSplit = command.split(" ");
                int number = Integer.parseInt(commandSplit[1]);
                int index = Integer.parseInt(commandSplit[2]);
                numbers.add(index, number);
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
