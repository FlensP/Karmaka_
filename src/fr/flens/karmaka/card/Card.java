package fr.flens.karmaka.card;

import fr.flens.karmaka.objects.Player;

public abstract class Card {

    private final int points;
    private final String name;

    public Card(String name, int value) {
        this.points = value;
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public abstract void active();

    public void useAsPoints(Player player) {
        //TODO
    }

    public void reserveForFutureLife(Player player) {
        //TODO
    }
}
