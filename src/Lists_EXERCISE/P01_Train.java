package Lists_EXERCISE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maximumCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");

            if (tokens.length == 2) {
                int passenger = Integer.parseInt(tokens[1]);
                wagons.add(passenger);
            } else {
                int passengerToAdd = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int passengers = wagons.get(i);
                    if (passengerToAdd + passengers <= maximumCapacity) {
                        wagons.add(i, passengers + passengerToAdd);
                        wagons.remove(i + 1);
                        break;
                    }
                }
                command = scanner.nextLine();
            }
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
