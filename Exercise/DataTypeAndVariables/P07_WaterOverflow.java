package DataTypeAndVariables_EXERCISE;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int currentLitters = 0;

        for (int i = 1; i <= n; i++) {
            int pouredLiters = Integer.parseInt(scanner.nextLine());
            currentLitters += pouredLiters;
            if (currentLitters > capacity) {
                System.out.println("Insufficient capacity!");
                currentLitters -= pouredLiters;
            }
        }
        System.out.println(currentLitters);
    }
}
