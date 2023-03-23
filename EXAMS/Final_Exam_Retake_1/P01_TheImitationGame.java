package Final_Exam_Retake_1;

import java.util.Scanner;

public class P01_TheImitationGame {
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
                    String elementsToMove = encryptedMessage.substring(0, numberOfLetters); //zzH
                    String remainingElements = encryptedMessage.substring(numberOfLetters); //e
                    encryptedMessage = remainingElements + elementsToMove;

                    break;

                case "Insert":
                    //•	"Insert {index} {value}":
                    //o	Inserts the given value before the given index in the string
                    int index = Integer.parseInt(operations.split("\\|")[1]);
                    String value = operations.split("\\|")[2];
                    String leftElements = encryptedMessage.substring(0, index);
                    String rightElements = encryptedMessage.substring(index);
                    leftElements.concat(value).concat(rightElements);
                    encryptedMessage = leftElements + value + rightElements;

                    break;

                case "ChangeAll":
                    //•	"ChangeAll {substring} {replacement}":
                    //o	Changes all occurrences of the given substring with the replacement text
                    String subString = operations.split("\\|")[1];
                    String replacement = operations.split("\\|")[2];

                    encryptedMessage = encryptedMessage.replace(subString, replacement);
                    break;
            }
            operations = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", encryptedMessage);
    }
}
