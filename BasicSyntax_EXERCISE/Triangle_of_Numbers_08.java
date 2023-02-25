package BasicSyntax_EXERCISE;

import java.util.Scanner;

public class Triangle_of_Numbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n; rows++) {
            for (int count = 1; count <= rows; count++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }
}
