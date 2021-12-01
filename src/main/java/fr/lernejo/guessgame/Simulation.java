package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;
        long rand = (long) (Math.random() * 100);
        initialize(rand);

    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        boolean lowerOrGreater;
        long playerInput = player.askNextGuess();
        if(playerInput == numberToGuess){
            System.out.println("Bien joué");
            this.logger.log("Le joueur a réussi à trouver le nombre");
            System.exit(0);
            return true;
        } else {
            if (playerInput > numberToGuess) {
                lowerOrGreater = true;
                player.respond(lowerOrGreater);
                this.logger.log("Le joueur a saisi un nombre trop grand");
                return false;
            } else {
                lowerOrGreater = false;
                player.respond(lowerOrGreater);
                this.logger.log("Le joueur a saisi un nombre trop petit");
                return false;
            }
        }
    }

    public void loopUntilPlayerSucceed() {
        while(true) {
            nextRound();
        }
    }
}
