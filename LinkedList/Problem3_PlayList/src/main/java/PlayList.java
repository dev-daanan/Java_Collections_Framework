package LinkedList.Problem3_PlayList.src.main.java;

import java.util.LinkedList;

public class PlayList {
    LinkedList<String> playlist;

    public PlayList(LinkedList<String> playlist) {
        this.playlist = playlist;
    }
    public PlayList() {
        this(new LinkedList<>());
    }


}
