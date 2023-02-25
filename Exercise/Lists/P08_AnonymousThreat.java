package Lists_EXERCISE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> texts = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            //merge {startIndex} {endIndex}
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > texts.size() - 1) {
                    endIndex = texts.size() - 1;
                }

                if (startIndex >= 0 && startIndex <= texts.size() - 1 && endIndex > 0 && endIndex <= texts.size() - 1) {

                    String resultMerge = "";
                    for (int index = startIndex; index <= endIndex; index++) {
                        String current = texts.get(index);
                        resultMerge += current;
                    }

                    for (int index = startIndex; index <= endIndex; index++) {
                        texts.remove(startIndex);
                    }

                    texts.add(startIndex, resultMerge);
                }
            } else if (command.contains("divide")) {
                //command = "divide {index} {partitions}"
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]); //брой на частите

                //валидираме индекса, от който ще взимаме текст
                if (index >= 0 && index <= texts.size() - 1) {
                    //{"abcdef", "ghi", "jkl"}
                    //divide 0 3
                    String textForDivide = texts.get(index); //"abcdef"
                    texts.remove(index);
                    //{"ghi", "jkl"}

                    //1. колко символа ще има всяка част
                    int countSymbolsPerPart = textForDivide.length() / parts;

                    //всички равни части без последната
                    int beginIndex = 0; //index в текста за деление
                    for (int part = 1; part < parts; part++) {
                        String textPerPart = textForDivide.substring(beginIndex, beginIndex + countSymbolsPerPart);
                        texts.add(index, textPerPart);
                        index++; //място на поставяне на разбитата част в главния списък
                        beginIndex += countSymbolsPerPart;
                    }

                    //последната част
                    String textLastParts = textForDivide.substring(beginIndex, textForDivide.length());
                    texts.add(index, textLastParts);
                }
            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", texts));
    }
}