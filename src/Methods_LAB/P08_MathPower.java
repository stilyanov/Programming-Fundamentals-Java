package Methods_LAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberInput = Double.parseDouble(scanner.nextLine());
        int powerInput = Integer.parseInt(scanner.nextLine());


        System.out.println(new DecimalFormat("0.####").format(mathPower(numberInput, powerInput)));
    }

    public static double mathPower(double number, int power) {

        return Math.pow(number, power);
    }
}
