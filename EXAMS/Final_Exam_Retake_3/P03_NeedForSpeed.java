package Final_Exam_Retake_3;

import java.util.*;

public class P03_NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();

        for (int index = 1; index <= numberOfCars; index++) {
            //"{car}|{mileage}|{fuel}"
            String[] carsArr = scanner.nextLine().split("\\|");
            String car = carsArr[0];
            int mileage = Integer.parseInt(carsArr[1]);
            int fuel = Integer.parseInt(carsArr[2]);

            carsMap.putIfAbsent(car, new ArrayList<>());
            carsMap.get(car).add(0, mileage);
            carsMap.get(car).add(1, fuel);
        }
        String commands = scanner.nextLine();
        while (!commands.equals("Stop")) {
            if (commands.contains("Drive")) {
                //•	"Drive : {car} : {distance} : {fuel}":
                String car = commands.split(" : ")[1];
                int distance = Integer.parseInt(commands.split(" : ")[2]);
                int fuel = Integer.parseInt(commands.split(" : ")[3]);

                driveCar(carsMap, car, distance, fuel);

            } else if (commands.contains("Refuel")) {
                //•	"Refuel : {car} : {fuel}":
                String car = commands.split(" : ")[1];
                int fuel = Integer.parseInt(commands.split(" : ")[2]);

                refuelCar(carsMap, car, fuel);

            } else if (commands.contains("Revert")) {
                //•	"Revert : {car} : {kilometers}":
                String car = commands.split(" : ")[1];
                int kilometers = Integer.parseInt(commands.split(" : ")[2]);

                revertCar(carsMap, car, kilometers);
            }
            commands = scanner.nextLine();
        }

        carsMap.entrySet().forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }

    private static void revertCar(Map<String, List<Integer>> carsMap, String car, int kilometers) {
        int currentKM = carsMap.get(car).get(0);

        int kmAfterRevert = currentKM - kilometers;
        if (kmAfterRevert < 10000) {
            kmAfterRevert = 10000;
        } else {
            System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
        }

        carsMap.get(car).set(0, kmAfterRevert);
    }

    private static void refuelCar(Map<String, List<Integer>> carsMap, String car, int fuel) {
        int currentFuel = carsMap.get(car).get(1);
        if (currentFuel + fuel > 75) {
            carsMap.get(car).set(1, 75);
            System.out.printf("%s refueled with %d liters%n", car, 75 - currentFuel);
        } else {
            carsMap.get(car).set(1, currentFuel + fuel);
            System.out.printf("%s refueled with %d liters%n", car, fuel);
        }
    }

    private static void driveCar(Map<String, List<Integer>> carsMap, String car, int distance, int fuel) {
        int currentKM = carsMap.get(car).get(0);
        int currentFuel = carsMap.get(car).get(1);

        if (currentFuel >= fuel) {
            carsMap.get(car).set(0, currentKM + distance);
            carsMap.get(car).set(1, currentFuel - fuel);
            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
        } else {
            System.out.println("Not enough fuel to make that ride");
        }

        if (carsMap.get(car).get(0) >= 100000) {
            System.out.printf("Time to sell the %s!%n", car);
            carsMap.remove(car);
        }
    }
}
