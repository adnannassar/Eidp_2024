package Klausuren.RegalAufgabe;

public class CD implements Medium {
    private int breite;

    public CD(int breite) {
        this.breite = breite;
    }

    @Override
    public double getGewicht() {
        return 1.5;
    }

    @Override
    public int getBreite() {
        return this.breite;
    }
}
