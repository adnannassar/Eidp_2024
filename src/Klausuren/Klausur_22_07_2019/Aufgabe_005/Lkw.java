package Klausuren.Klausur_22_07_2019.Aufgabe_005;

public class Lkw extends Fahrzeug {
    private int id;
    private static int counter;

    public Lkw() {
        super(2, "Diesel");
        counter++;
        id = counter;
    }

    @Override
    public double berechneVerbrauchPro100Km() {
        return 25;
    }

    @Override
    public String toString() {
        return "Lkw " + id +  " " + super.toString();
    }
}
