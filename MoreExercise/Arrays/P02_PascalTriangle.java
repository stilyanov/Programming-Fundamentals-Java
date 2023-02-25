package Arrays_MoreExercise;

import java.util.Scanner;

public class P02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (long rows = 1; rows <= n; rows++) {
            long newNumber = 1;
            for (long colons = 1; colons <= rows; colons++) {
                System.out.print(newNumber + " ");
                newNumber = newNumber * (rows - colons) /colons;
            }
            System.out.println();
        }
    }
}
