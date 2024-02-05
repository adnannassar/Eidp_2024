package Klausuren.Klausur_22_07_2019.Aufgabe_007;

public class Video extends Medium {
    private int spieldauer, bildformat;

    public Video(String name, int spieldauer, int bildformat) {
        super(name);
        this.spieldauer = spieldauer;
        this.bildformat = bildformat;
    }

    @Override
    public int berechneSpeicherVerbrauch() {
        return spieldauer * bildformat;
    }
}
