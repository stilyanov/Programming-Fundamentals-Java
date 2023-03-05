package AssociativeArrays_EXERCISE;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> registrationMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String command = data[0];

            switch (command) {
                case "register":
                    //register {username} {licensePlateNumber}
                    String userName = data[1];
                    String licensePlateNumber = data[2];
                    if (!registrationMap.containsKey(userName)) {
                        registrationMap.put(userName, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", userName, licensePlateNumber);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                    }

                    break;
                case "unregister":
                    //unregister {username}
                    userName = data[1];
                    if (!registrationMap.containsKey(userName)) {
                        System.out.printf("ERROR: user %s not found%n", userName);
                    } else {
                        registrationMap.remove(userName);
                        System.out.printf("%s unregistered successfully%n", userName);
                    }

                    break;
            }
        }
        registrationMap.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
