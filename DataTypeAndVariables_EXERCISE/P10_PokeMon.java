package DataTypeAndVariables_EXERCISE;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine()); // N
        int distance = Integer.parseInt(scanner.nextLine()); // M
        int exhaustionFactor = Integer.parseInt(scanner.nextLine()); // Y

        int startedPower = power;

        int pokedTargets = 0;

        while (power >= distance) {
            power -= distance;
            pokedTargets++;

            if (power == startedPower / 2) {
                if (exhaustionFactor != 0) {
                    power = power / exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(pokedTargets);
    }
}
