package fr.flens.karmaka.card;

import fr.flens.karmaka.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stack {

    private final List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public void addCard(Card card, int index) {
        cards.add(index, card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards, Main.getRandom());
    }

    public Card draw() {
        Card card = cards.getFirst();
        cards.remove(card);
        return card;
    }
}
