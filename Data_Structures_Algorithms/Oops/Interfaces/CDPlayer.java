package Interfaces;

public class CDPlayer implements MediaPlayer {
    public void Start() {
        System.out.println("Music Started");
    }

    public void stop() {
        System.out.println("Music Stoped");
    }
}
