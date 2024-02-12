package Klausuren.RegalAufgabe;

public class Buch implements Medium{
    private int breite;
    private double gewicht;

    public Buch(int breite, double gewicht) {
        this.breite = breite;
        this.gewicht = gewicht;
    }

    @Override
    public double getGewicht() {
       return this.gewicht;
    }

    @Override
    public int getBreite() {
      return this.breite;
    }
}
