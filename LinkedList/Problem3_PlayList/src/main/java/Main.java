package LinkedList.Problem3_PlayList.src.main.java;

public class Main {
    public static void main(String[] args) {
        PlayList myPlayList = new PlayList();
//        for (int i = 0; i < 5; i++) {
//            myPlayList.addSong(
//                    InputHandling.getInput("Enter Song Title"),
//                    InputHandling.getIntInput("Enter Song Duration in Seconds"));
//        }
//        Song song1 = new Song("A First One", 111);
//        Song song2 = new Song("B Second Two", 222);
//        Song song3 = new Song("C Third Three", 333);
//        Song song4 = new Song("D Fourth Four", 444);
//        Song song5 = new Song("E Fifth Five", 555);
        myPlayList.addSong("A First One", 111);
        myPlayList.addSong("B Second Two", 222);
        myPlayList.addSong("C Third Three", 333);
        myPlayList.addSong("D Fourth Four", 444);
        myPlayList.addSong("E Fifth Five", 555);


        myPlayList.playCurrentSong();
        myPlayList.skipForward();
        myPlayList.skipForward();
        myPlayList.skipForward();
        myPlayList.skipForward();
        myPlayList.skipForward();
        myPlayList.skipBackward();
        myPlayList.removeCurrentSong();



    }
}
