package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> productsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String product = scanner.nextLine();
            productsList.add(product);
        }
        Collections.sort(productsList);

        int number = 1;
        for (String product : productsList) {
            System.out.println(number + "." + product);
            number++;
        }
    }
}
