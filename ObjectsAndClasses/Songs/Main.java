package ObjectsAndClasses.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();

        for (int song = 1; song <= numberOfSongs; song++) {
            String[] inputSong = scanner.nextLine().split("_");
            String typeListInput = inputSong[0];
            String nameInput = inputSong[1];
            String timeInput = inputSong[2];

            Song currentSong = new Song(typeListInput, nameInput, timeInput);

            songList.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song song :songList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songList) {
                String currentTypeList = song.getTypeList();
                if (currentTypeList.equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
