package fr.flens.karmaka.manager;

import fr.flens.karmaka.Main;
import fr.flens.karmaka.card.Card;
import fr.flens.karmaka.card.Spite;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class CardManager {

    HashMap<Class<? extends Card>, Integer> cardList = new HashMap<>();

    public void init() {
        initCardList();
        generateWell();
    }

    public void initCardList() {
        cardList.put(Spite.class, 2);
    }

    public void generateWell() {
        for (Class<? extends Card> c : cardList.keySet()) {
            for (int i = 0; i < cardList.get(c); i++) {
                try {
                    Main.getInstance().getGame().getWell().addCard(c.getDeclaredConstructor().newInstance());
                } catch (InstantiationException | NoSuchMethodException | IllegalAccessException |
                         InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
