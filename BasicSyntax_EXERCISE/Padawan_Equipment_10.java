package BasicSyntax_EXERCISE;

import java.util.Scanner;

public class Padawan_Equipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightSabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double total = (Math.ceil(countStudents * 1.1)) * lightSabersPrice + robesPrice * countStudents + beltsPrice * countStudents;
        int count = countStudents / 6;
        if (count != 0) {
            total -= count * beltsPrice;
        }

        if (total <= moneyAvailable) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else if (total > moneyAvailable) {
            System.out.printf("George Lucas will need %.2flv more.", total - moneyAvailable);
        }
    }
}
