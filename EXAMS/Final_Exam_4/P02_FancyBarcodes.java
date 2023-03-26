package Final_Exam_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String barcode = scanner.nextLine();
            String regex = "@#+(?<text>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barcode);
            if (!matcher.find()) {
                System.out.println("Invalid barcode");
            } else {
                StringBuilder builder = new StringBuilder();
                String text = matcher.group("text");
                for (char symbol : text.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        builder.append(symbol);
                    }
                }
                if (builder.toString().equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + builder);
                }
            }
        }
    }
}
