import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();

        String operations = scanner.nextLine();
        while (!operations.equals("Decode")) {
            String command = operations.split("\\|")[0];
            switch (command) {
                case "Move":
                    //•	"Move {number of letters}":
                    //o	Moves the first n letters to the back of the string
                    int numberOfLetters = Integer.parseInt(operations.split("\\|")[1]);
                    String elementsToMove = encryptedMessage.substring(0, numberOfLetters);
                    String remainingElements = encryptedMessage.substring(numberOfLetters);
                    remainingElements.concat(elementsToMove);

                    break;

                case "Insert":

                    break;

                case "ChangeAll":
                    //•	"ChangeAll {substring} {replacement}":
                    //o	Changes all occurrences of the given substring with the replacement text
                    String subString = operations.split("\\|")[1];
                    String replacement = operations.split("\\|")[2];

                    encryptedMessage.replace(subString, replacement);
                    break;
            }


            operations = scanner.nextLine();
        }
    }
}
