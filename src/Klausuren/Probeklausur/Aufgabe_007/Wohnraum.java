package Klausuren.Probeklausur.Aufgabe_007;

public class Wohnraum extends Raum {
    private int anzahlFenster;

    public Wohnraum(String bezeichnung, float länge, float breite, int anzahlFenster) {
        super(bezeichnung, länge, breite);
        this.anzahlFenster = anzahlFenster;
    }

    public int getAnzahlFenster() {
        return anzahlFenster;
    }
}
