package fr.lernejo.guessgame;
import java.util.Scanner;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class HumanPlayer implements Player{
    private Logger logger = LoggerFactory.getLogger("player");
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
    public void respond( boolean lowerOrGreater ) {
        logger.log( "Input number is " + ( lowerOrGreater ? "lower" : "greater") + " than the number to guess" );
    }


}
