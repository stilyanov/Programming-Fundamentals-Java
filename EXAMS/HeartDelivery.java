package EXAMS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] neighbourhood = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        //Jump 1 ->> [10, 8, 10, 2] Jump 2 ->> [10, 8, 10, 0] so we print "Place 3 has Valentine's day."
        // "Jump {length}"
        //[10, 10, 10, 2]
        //Jump 1
        //Jump 2
        //Love!
        int currentIndex = 0;
        String command = scanner.nextLine();
        while (!command.equals("Love!")) {
            int jumpLength = Integer.parseInt(command.split(" ")[1]);
            currentIndex += jumpLength;

            if (currentIndex >= neighbourhood.length) {
                currentIndex = 0;
            }
            if (neighbourhood[currentIndex] != 0) {
                neighbourhood[currentIndex] -= 2;
                if (neighbourhood[currentIndex] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }

            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        boolean isSuccessful = true;
        for (int house : neighbourhood) {
            if (house != 0) {
                isSuccessful = false;
                break;
            }
        }
        int count = 0;
        for (int house : neighbourhood) {
            if (house != 0) {
                count++;
            }
        }
        if (isSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", count);
        }
    }
}
