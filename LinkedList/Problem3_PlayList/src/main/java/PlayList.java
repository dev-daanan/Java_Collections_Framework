package LinkedList.Problem3_PlayList.src.main.java;

import java.util.LinkedList;

public class PlayList {
    private final LinkedList<Song> playlist;
    private int currentSongIndex;

    public PlayList(LinkedList<Song> playlist) {
        this.playlist = playlist;
        currentSongIndex = 0;
    }

    public PlayList() {
        this(new LinkedList<>());
    }

    public void addSong(Song song) {
        playlist.add(song);
    }

    public void addSong(String songTitle, int songDuration) {
        playlist.add(new Song(songTitle, songDuration));
    }

    public Song removeCurrentSong() {
        Song song = null;
        if (playlist.size() < 1) return null;

        if (currentSongIndex == 0) {
            song = playlist.removeFirst();
        } else if (currentSongIndex == playlist.size() - 1) {
            song = playlist.removeLast();
        } else {
            song = playlist.remove(currentSongIndex);
        }
        System.out.println("Index: " + (currentSongIndex + 1) + ". " + song + " --- REMOVED");

//        System.out.println(song + " - Removed");
        skipForward();
        return song;
    }

    public void skipForward() {
        if (currentSongIndex < playlist.size() - 1) {
            currentSongIndex++;
        } else {
            currentSongIndex = 0;
        }
        playCurrentSong();
    }

    public void skipBackward() {
        if (currentSongIndex > 0) {
            System.out.println("prev. song");
            currentSongIndex--;
        } else {
            currentSongIndex = playlist.size() - 1;
        }
        playCurrentSong();
    }

    public void pauseCurrentSong() {
        System.out.println("Now paused: " + playlist.get(currentSongIndex));
    }

    public void playCurrentSong() {
        System.out.println("Index: " + (currentSongIndex + 1) + ". Now playing: " + playlist.get(currentSongIndex));
    }

    public void printPlaylist() {
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(i + 1 + " " + playlist.get(currentSongIndex));
        }
    }
}
