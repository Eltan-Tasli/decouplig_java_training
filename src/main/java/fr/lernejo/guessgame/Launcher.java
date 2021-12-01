package fr.lernejo.guessgame;

public class Launcher {
    public static void main(String[] args) {
        HumanPlayer joueur = new HumanPlayer();
        Simulation simul = new Simulation(joueur);
        simul.loopUntilPlayerSucceed();
        System.exit(0);
    }
}
