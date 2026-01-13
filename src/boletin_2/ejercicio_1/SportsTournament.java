package boletin_2.ejercicio_1;

public class SportsTournament {

    public static void main(String[] args) {
        MOBAGamer mobaGamer = new MOBAGamer();
        FPSGamer fpsGamer = new FPSGamer();
        SportsGamer sportsGamer = new SportsGamer();
        Gamer[] gamers = new Gamer[3];
        gamers[0] = mobaGamer;
        gamers[1] = fpsGamer;
        gamers[2] = sportsGamer;

        startTournament(gamers);
    }

    public static void startTournament(Gamer[] players) {
        for (int i = 0; i < players.length; i++) {
            players[i].playGame();
        }
    }
}
