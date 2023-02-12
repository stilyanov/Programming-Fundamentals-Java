package Lists_EXERCISE;

import java.util.*;
import java.util.stream.Collectors;

public class P07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        List<String> outputList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String[] currentArray = input[i].split("\\s+");

            for (int j = currentArray.length - 1; j >= 0; j--) {
                if (!currentArray[j].equals("")) {
                    outputList.add(0, currentArray[j]);
                }
            }
        }

        outputList.forEach(e -> System.out.print(e + " "));
    }
}
