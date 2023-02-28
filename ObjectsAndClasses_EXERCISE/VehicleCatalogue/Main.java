package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] data = command.split(" ");
            String type = data[0];
            String model = data[1];
            String color = data[2];
            int horsePower = Integer.parseInt(data[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehicleList.add(vehicle);

            command = scanner.nextLine();
        }
        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println(vehicle);
                }
            }
            model = scanner.nextLine();
        }

        double sumCar = 0;
        double sumTruck = 0;
        int countCar = 0;
        int countTruck = 0;

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getType().equals("car")) {
                sumCar += vehicle.getHorsePower();
                countCar++;
            } else if (vehicle.getType().equals("truck")) {
                sumTruck += vehicle.getHorsePower();
                countTruck++;
            }
        }
        double averageCars = sumCar / countCar;
        if (countCar == 0) {
            averageCars = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);
        double averageTrucks = sumTruck / countTruck;
        if (countTruck == 0) {
            averageTrucks = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucks);
    }
}
