package Klausuren.RegalAufgabe;

public class RegalBrett {
    private int breite;
    private double tragkraft;
    private Medium[] mediums = new Medium[100];

    public RegalBrett(int breite, double tragkraft) {
        this.breite = breite;
        this.tragkraft = tragkraft;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public double getTragkraft() {
        return tragkraft;
    }

    public void setTragkraft(double tragkraft) {
        this.tragkraft = tragkraft;
    }

    public Medium[] getMediums() {
        return mediums;
    }
}
