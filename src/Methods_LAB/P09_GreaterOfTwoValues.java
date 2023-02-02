package Methods_LAB;

import java.util.Scanner;

public class P09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());

                System.out.println(getMax(firstNum, secondNum));

                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);

                System.out.println(getMax(firstSymbol, secondSymbol));

                break;
            case "string":
                String firstName = scanner.nextLine();
                String secondName = scanner.nextLine();

                System.out.println(getMax(firstName, secondName));

                break;
        }
    }

    public static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static char getMax(char symbol1, char symbol2) {
        if (symbol1 > symbol2) {
            return symbol1;
        } else {
            return symbol2;
        }
    }

    public static String getMax(String name1, String name2) {
        if (name1.compareTo(name2) > 0) {
            return name1;
        } else {
            return name2;
        }
    }
}
