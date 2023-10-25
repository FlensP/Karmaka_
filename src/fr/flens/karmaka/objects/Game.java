package fr.flens.karmaka.objects;

import fr.flens.karmaka.Main;
import fr.flens.karmaka.card.Stack;
import fr.flens.karmaka.enums.StateGame;
import fr.flens.karmaka.manager.CardManager;

public class Game {

    private Player player1;
    private Player player2;
    private CardManager cardManager;
    private StateGame stateGame;
    private Stack well;
    private Stack ruins;
    private Player currentPlayer;

    public Game() {
        stateGame = StateGame.INIT;
        init();
    }

    public void init() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.cardManager = new CardManager();
        this.well = new Stack();
        this.ruins = new Stack();
        cardManager.init();
        if (well.getCards().size() < 12) {
            System.out.println("NON");
            return;
        }
        for (int i = 0; i < 4; i++) {
            player1.getHand().add(well.draw());
            player2.getHand().add(well.draw());
        }
        for (int i = 0; i < 2; i++) {
            player1.getDeck().addCard(well.draw());
            player2.getDeck().addCard(well.draw());
        }
        start();
    }

    public void start() {
        stateGame = StateGame.PLAYING;
        currentPlayer = (Main.getRandom().nextInt(2) == 1) ? player1 : player2;
        while (true) {
            //TOUR
            this.currentPlayer = (currentPlayer==player1) ? player2 : player1;
        }
    }

    public void end() {
        stateGame = StateGame.END;
    }

    public StateGame getStateGame() {
        return stateGame;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public CardManager getCardManager() {
        return cardManager;
    }

    public Stack getRuins() {
        return ruins;
    }

    public Stack getWell() {
        return well;
    }
}
