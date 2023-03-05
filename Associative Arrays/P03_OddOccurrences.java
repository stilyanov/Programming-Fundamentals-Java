import java.util.*;

public class P03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> countMap = new LinkedHashMap<>();

        for (String word : wordsArr) {
            word = word.toLowerCase();

            countMap.putIfAbsent(word, 0);
//            int value = countMap.get(word);
//            countMap.put(word, value + 1);
            countMap.put(word, countMap.get(word) + 1);
        }
        List<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}
