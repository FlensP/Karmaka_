package fr.flens.karmaka;

import fr.flens.karmaka.objects.Game;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Main instance;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private final Game game;

    private Main() {
        this.game = new Game();
        game.init();
    }

    public static void main(String[] args) {
        getInstance();
    }

    public static Main getInstance() {
        if (!(instance == null)) {
            return instance;
        }
        instance = new Main();
        return instance;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static Random getRandom() {
        return random;
    }

    public Game getGame() {
        return game;
    }
}
