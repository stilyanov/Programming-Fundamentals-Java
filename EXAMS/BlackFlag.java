import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());                 //5
        int dailyPlunder = Integer.parseInt(scanner.nextLine());              //40
        double expectedPlunder = Double.parseDouble(scanner.nextLine()); //100

        double sumPlunder = 0;

        for (int day = 1; day <= days; day++) {
            sumPlunder += dailyPlunder;

            if (day % 3 == 0) {
                double extraPlunder = dailyPlunder * 0.5;
                sumPlunder += extraPlunder;
            }

            if (day % 5 == 0) {
                sumPlunder = sumPlunder - (sumPlunder * 0.30);
            }


        }
        if (sumPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", sumPlunder);
        } else {
            double percent = (sumPlunder / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percent);
        }
    }
}
