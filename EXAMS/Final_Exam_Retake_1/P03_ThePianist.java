package Final_Exam_Retake_1;

import java.util.*;

public class P03_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] data = scanner.nextLine().split("\\|"); //"{piece}|{composer}|{key}"
            String piece = data[0];
            String composer = data[1];
            String key = data[2];
//            List<String> piecesList = new ArrayList<>();
//            piecesList.set(0, composer);
//            piecesList.set(1, key);
//            piecesMap.put(piece, piecesList);
            piecesMap.putIfAbsent(piece, new ArrayList<>());
            piecesMap.get(piece).add(0, composer);
            piecesMap.get(piece).add(1, key);
        }

        String commands = scanner.nextLine();
        while (!commands.equals("Stop")) {
            if (commands.contains("Add")) {
                //•	"Add|{piece}|{composer}|{key}":
                String piece = commands.split("\\|")[1];
                String composer = commands.split("\\|")[2];
                String key = commands.split("\\|")[3];

                if (!piecesMap.containsKey(piece)) {
                    piecesMap.putIfAbsent(piece, new ArrayList<>());
                    piecesMap.get(piece).add(0, composer);
                    piecesMap.get(piece).add(1, key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);

                } else {
                    System.out.println(piece + " is already in the collection!");
                }

            } else if (commands.contains("Remove")) {
                //•	"Remove|{piece}":
                String piece = commands.split("\\|")[1];
                if (piecesMap.containsKey(piece)) {
                    piecesMap.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            } else if (commands.contains("ChangeKey")) {
                //•	"ChangeKey|{piece}|{new key}":
                String piece = commands.split("\\|")[1];
                String newKey = commands.split("\\|")[2];
                if (piecesMap.containsKey(piece)) {
                    List<String> pieceInfo = piecesMap.get(piece);
                    pieceInfo.set(1, newKey);
                    piecesMap.put(piece, pieceInfo);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }
            commands = scanner.nextLine();
        }
        //"{Piece} -> Composer: {composer}, Key: {key}"
        piecesMap.entrySet().forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
