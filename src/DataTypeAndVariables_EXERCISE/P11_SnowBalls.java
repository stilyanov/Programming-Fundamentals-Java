package DataTypeAndVariables_EXERCISE;

import java.util.Scanner;

public class P11_SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        int snowballSnowBiggest = 0;
        int snowballSnowTimeBiggest = 0;
        int snowballSnowQualityBiggest = 0;

        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            //{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})
            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                snowballSnowBiggest = snowballSnow;
                snowballSnowTimeBiggest = snowballTime;
                snowballSnowQualityBiggest = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowBiggest, snowballSnowTimeBiggest, maxValue, snowballSnowQualityBiggest);
    }
}
