package Final_Exam_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([=/])(?<destination>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);

        List<String> destinationsList = new ArrayList<>();
        int travelPoints = 0;

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String destination = matcher.group("destination");
            travelPoints += destination.length();
            destinationsList.add(destination);
        }

        System.out.println("Destinations: " + String.join(", ", destinationsList));
        System.out.println("Travel Points: " + travelPoints);
    }
}
