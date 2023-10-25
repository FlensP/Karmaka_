package fr.flens.karmaka.objects;

import fr.flens.karmaka.Main;
import fr.flens.karmaka.card.Card;
import fr.flens.karmaka.card.Stack;
import fr.flens.karmaka.enums.KarmicLevel;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final List<Card> hand = new ArrayList<>();
    private final Stack deck = new Stack();
    private final Stack futureLife = new Stack();
    private final Stack deeds = new Stack();
    private int karmicRings;
    private final KarmicLevel karmicLevel;
    private String name;


    public Player() {
        askName();
        this.karmicLevel = KarmicLevel.DungBeetle;
    }

    public void askName() {
        String s = null;
        while (s == null) {
            System.out.println("Veuillez entrer le nom du joueur");
            s = Main.getScanner().nextLine();
        }
        this.name = s;
    }

    public void playTurn() {
        StringBuilder txt = new StringBuilder();
        for (Card card : hand) {
            txt.append(" ").append(hand.indexOf(card)).append(") ").append(card.getName());
        }
        System.out.println("C'est votre tour " + name + " !");
        System.out.println("Votre main est composée de : " + txt);

        if (deck.getCards().size() > 0) {
            Card c = deck.draw();
            hand.add(c);
            System.out.println("Vous avez piocher une carte : " + c.getName());
        } else {
            if (hand.size() == 0) {
                reborn();
                return;
            } else {
                System.out.println("Votre pile est vide, par conséquent, vous n'avez pas pioché");
            }
        }
        Card c = null;
        boolean pass = false;
        while (c == null || pass) {

        }


    }

    public void reborn() {

    }

    public String getName() {
        return name;
    }

    public Stack getDeck() {
        return deck;
    }

    public List<Card> getHand() {
        return hand;
    }

    public Player getOtherPlayer() {
        Game game = Main.getInstance().getGame();
        return (game.getPlayer1() == this) ? game.getPlayer2() : game.getPlayer1();
    }
}
