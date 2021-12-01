package fr.lernejo.guessgame;
import java.util.Scanner;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class HumanPlayer implements Player{
    public HumanPlayer() {
        Logger logger = LoggerFactory.getLogger("player");
    }

    @Override
    public long askNextGuess() {
        System.out.println("Saisir un nombre");
        Scanner scanner = new Scanner(System.in);
        long playerGuess;
        playerGuess = scanner.nextInt();
        return playerGuess;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater == true){
            System.out.println("Ton input est trop grand");
        } else {
            System.out.println("Ton input est trop petit");
        }

    }
}
