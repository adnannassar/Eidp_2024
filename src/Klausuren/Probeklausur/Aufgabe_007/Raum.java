package Klausuren.Probeklausur.Aufgabe_007;

public abstract class Raum {
    private String bezeichnung;
    private float länge, breite;

    public Raum(String bezeichnung, float länge, float breite) {
        this.bezeichnung = bezeichnung;
        this.länge = länge;
        this.breite = breite;
    }

    public float berechneFläche() {
        return länge * breite;
    }
}
