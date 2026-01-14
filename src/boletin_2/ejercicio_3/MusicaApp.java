package boletin_2.ejercicio_3;

public class MusicaApp {

    public static void main(String[] args) {

        MusicPlayer[] players = new MusicPlayer[]{new Spotify(), new iTunes(), new MP3Player()};

        startMusic(players);
    }

    private static void startMusic(MusicPlayer[] players) {

        for (int i = 0; i < players.length; i++) {
            if (players[i] instanceof Spotify) {
                ((Spotify) players[i]).stream();
                players[i].play();
                players[i].stop();
            }

            if (players[i] instanceof iTunes) {
                ((iTunes) players[i]).load();
                players[i].play();
                players[i].stop();
            }

            if (players[i] instanceof MP3Player) {
                ((MP3Player) players[i]).load();
                players[i].play();
                players[i].stop();
            }
        }
    }
}
