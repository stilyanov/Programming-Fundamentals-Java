package EXAMS;

import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scanner.nextLine());
        int countBattles = Integer.parseInt(scanner.nextLine());

        double total = 0;
        int counter = 0;

        for (int battle = 1; battle <= countBattles; battle++) {

            if (total >= neededExperience) {
                break;
            }

            double experiencePerBattle = Double.parseDouble(scanner.nextLine());



                total = total + experiencePerBattle;
            if (battle % 3 == 0) {
                double extraExperience = experiencePerBattle + (experiencePerBattle * 0.15);
                total -= experiencePerBattle;
                total += extraExperience;
            }

            if (battle % 5 == 0) {
                double lessExperience = experiencePerBattle - (experiencePerBattle * 0.10);
                total -= experiencePerBattle;
                total += lessExperience;
            }

            if (battle % 15 == 0) {
                double extraExperience = experiencePerBattle + (experiencePerBattle * 0.05);
                total -= experiencePerBattle;
                total += extraExperience;
            }
            counter++;
        }
        if (total >= neededExperience) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", counter);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", Math.abs(total - neededExperience));
        }
    }
}
