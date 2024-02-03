package Klausuren.Klausur_22_07_2019.Aufgabe_005;

public abstract class Fahrzeug {

    private int anzPersonen;
    private String treibstoffArt;
    public Fahrzeug(int anzPersonen, String treibstoffArt)
    {
        this.anzPersonen = anzPersonen;
        this.treibstoffArt = treibstoffArt;
    }
    public abstract double berechneVerbrauchPro100Km();
    protected double kmProLiter() {
        return 100/berechneVerbrauchPro100Km();
    }
    public String toString() {
        return "tankt " + treibstoffArt + " für "
                + anzPersonen + " Personen, ";
    }
}
