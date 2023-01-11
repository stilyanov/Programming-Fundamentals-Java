package Basic_Syntax_Conditional_Statements_And_Loops_LAB;

import java.util.Scanner;

public class Back_in_30_Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inHours = Integer.parseInt(scanner.nextLine());
        int inMinutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (inHours * 60) + inMinutes + 30;

        int hours = allMinutes / 60;
        int minutes = allMinutes % 60;

        if (hours > 23) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
