package fr.flens.karmaka.objects;

import fr.flens.karmaka.enums.Strategy;

public class VirtualPlayer extends Player {

    private final Strategy strategy;

    public VirtualPlayer(Strategy strategy) {
        super();
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }
}
