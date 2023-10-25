package fr.flens.karmaka.enums;

public enum KarmicLevel {

    DungBeetle(), Snake(), Wolf(), Ape(), Transcendence();

    public int getPointsForAdvance() {
        switch (this) {
            case DungBeetle -> {
                return 4;
            }
            case Snake -> {
                return 5;
            }
            case Wolf -> {
                return 6;
            }
            case Ape -> {
                return 7;
            }
            case Transcendence -> {
                return -1;
            }
        }
        return -1;
    }
}
