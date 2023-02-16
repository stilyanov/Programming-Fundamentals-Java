package Methods_EXERCISE;

import java.util.Scanner;

public class P07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printMatrix(number);
    }

    public static void printMatrix(int n) {
        for (int cols = 1; cols <= n; cols++) {
            for (int rows = 1; rows <= n; rows++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
