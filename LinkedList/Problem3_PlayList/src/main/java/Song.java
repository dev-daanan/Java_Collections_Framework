package LinkedList.Problem3_PlayList.src.main.java;

public class Song {
    private String title;
    private int durationInSeconds;

    public Song(String title, int durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    @Override
    public String toString() {
        return "Song: \"" + title + " ("+ durationInSeconds + ")";
    }
}
