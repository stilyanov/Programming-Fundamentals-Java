import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();

        System.out.printf("My name is %s and i am %d years old", name, age);

    }
}
