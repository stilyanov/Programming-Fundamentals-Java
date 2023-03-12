package EXAMS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int health = Integer.parseInt(scanner.nextLine());

        boolean isSunken = false;

        String command = scanner.nextLine();
        while (!command.equals("Retire")) {
            if (command.contains("Fire")) {
                //"Fire {index} {damage}"
                int index = Integer.parseInt(command.split(" ")[1]);
                int damage = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index < warShip.size()) {
                    int valueToReduce = warShip.get(index);
                    int newValue = valueToReduce - damage; // 110 - 10  = 100
                    warShip.set(index, newValue);
                    if (warShip.get(index) <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        isSunken = true;
                        break;
                    }
                }

            } else if (command.contains("Defend")) {
                //"Defend {startIndex} {endIndex} {damage}"
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                int damage = Integer.parseInt(command.split(" ")[3]);
                if (startIndex >= 0 && endIndex < pirateShip.size()) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        int pirateShipIndexDamage = pirateShip.get(i) - damage;
                        if (pirateShipIndexDamage <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            isSunken = true;
                            break;
                        } else {
                            pirateShip.set(startIndex, pirateShipIndexDamage);
                            startIndex++;
                        }
                    }
                }

            } else if (command.contains("Repair")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int repairHealth = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index < pirateShip.size()) {
                    if (repairHealth > health) {
                        repairHealth = health;
                        pirateShip.set(index, repairHealth);
                    } else {
                        int repairedSection = pirateShip.get(index) + repairHealth;
                        pirateShip.set(index, repairedSection);
                    }
                }

            } else if (command.contains("Status")) {
                double sectionForRepair = health * 0.2;
                int count = 0;
                for (int currentSection : pirateShip) {
                    if (sectionForRepair > currentSection) {
                        count++;
                    }
                }
                System.out.printf("%d sections need repair.%n", count);
            }

            command = scanner.nextLine();
        }
        if (!isSunken) {
            int pirateShipSum = 0;
            int warShipSum = 0;

            for (Integer currentPirateSection : pirateShip) {
                pirateShipSum += currentPirateSection;
            }

            System.out.printf("Pirate ship status: %d%n", pirateShipSum);

            for (Integer currentWarSection : warShip) {
                warShipSum += currentWarSection;
            }
            System.out.printf("Warship status: %d%n", warShipSum);
        }
    }
}
