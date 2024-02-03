package Klausuren.Klausur_22_07_2019.Aufgabe_005;

public class Pkw extends Fahrzeug {
    public Pkw(int anzPersonen) {
        super(anzPersonen,"Benzin" );
    }

    @Override
    public double berechneVerbrauchPro100Km() {
        return 5;
    }
    @Override
    public String toString() {
        return "Der Pkw " + super.toString();
    }
}
