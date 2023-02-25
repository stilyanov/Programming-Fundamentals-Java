package EXAMS;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine()) * 1000;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000;    // сено
        double cover = Double.parseDouble(scanner.nextLine()) * 1000;
        double weight = Double.parseDouble(scanner.nextLine()) * 1000;

        // 300 грама
//        double foodGrams = food * 1000;
//        double hayGrams = hay * 1000;
//        double coverGrams = cover * 1000;
//        double weightGrams = weight * 1000;

        int dayCounter = 1;

        while (dayCounter <= 30) {
            food -= 300;

            if (dayCounter % 2 == 0) {
                double neededHay = food * 0.05;
                hay -= neededHay;
            }

            if (dayCounter % 3 == 0) {
                double coverThirdDay = weight / 3;
                cover -= coverThirdDay;
            }
            dayCounter++;

        }

        double foodKG = food / 1000;
        double hayKG = hay / 1000;
        double coverKG = cover / 1000;

        if (foodKG >= 0 && hayKG >= 0 && coverKG >= 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodKG, hayKG, coverKG);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
