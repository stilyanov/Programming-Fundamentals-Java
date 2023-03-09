package EXAMS;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targetsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int targetsCounter = 0;

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            int indexOfTarget = Integer.parseInt(command);
            if (indexOfTarget >= 0 && indexOfTarget < targetsArr.length) {
                targetsCounter++;
                int currentNumber = targetsArr[indexOfTarget];
                targetsArr[indexOfTarget] = -1;

                for (int i = 0; i < targetsArr.length; i++) {
                    if (targetsArr[i] != -1 && targetsArr[i] <= currentNumber) {
                        targetsArr[i] = targetsArr[i] + currentNumber;
                    } else if (targetsArr[i] != -1 && targetsArr[i] > currentNumber) {
                        targetsArr[i] = targetsArr[i] - currentNumber;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", targetsCounter);
        for (int target : targetsArr) {
            System.out.print(target + " ");
        }
    }
}
