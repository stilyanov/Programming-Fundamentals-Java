package Methods_LAB;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int area = area(a, b);

        System.out.println(area);
    }

    public static int area(int a, int b) {
        return a * b;
    }
}
