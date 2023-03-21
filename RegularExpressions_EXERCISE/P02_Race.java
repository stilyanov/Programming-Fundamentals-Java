import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racersList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String, Integer> racersMap = new LinkedHashMap<>();
        racersList.forEach(racer -> racersMap.put(racer, 0));

        String regexName = "[A-Za-z]";
        Pattern patternName = Pattern.compile(regexName);

        String regexDistance = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexDistance);

        String input = scanner.nextLine();

        while (!input.equals("end of race")) {
            StringBuilder name = new StringBuilder();
            Matcher matcherName = patternName.matcher(input);

            while (matcherName.find()) {
                name.append(matcherName.group());
            }

            int distance = 0;
            Matcher matcherDistance = patternDistance.matcher(input);

            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }

            String racerName = name.toString();
            if (racersList.contains(racerName)) {
                int currentDistance = racersMap.get(racerName);
                racersMap.put(racerName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }

        //{"George", "Peter", "Bill", "Tom"}
        for (int index = 0; index < 3; index++) {
            String racer = racersList.get(index);
            if (index == 0) {
                System.out.println("1st place: " + racer);
            } else if (index == 1) {
                System.out.println("2nd place: " + racer);
            } else {
                System.out.println("3rd place: " + racer);
            }
        }
    }
}
