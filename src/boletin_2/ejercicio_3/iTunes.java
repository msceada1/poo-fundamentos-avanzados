package boletin_2.ejercicio_3;

public class iTunes implements OfflineMusicPlayer {

    @Override
    public void load() {
        System.out.println("Loading music on iTunes");
    }

    @Override
    public void play() {
        System.out.println("playing music on iTunes");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on iTunes");
    }
}
