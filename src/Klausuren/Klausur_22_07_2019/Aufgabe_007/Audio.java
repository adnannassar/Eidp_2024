package Klausuren.Klausur_22_07_2019.Aufgabe_007;

public class Audio extends Medium {
    private int spieldauer, auflösung;

    public Audio(String name, int spieldauer, int auflösung) {
        super(name);
        this.spieldauer = spieldauer;
        this.auflösung = auflösung;
    }


    @Override
    public int berechneSpeicherVerbrauch() {
        return 500;
    }
}
