package Klausuren.Klausur_22_07_2019.Aufgabe_005;

public class EBus extends Fahrzeug {
    private static int counter;
    private  int id;

    public EBus(int anzPersonen) {
        super(anzPersonen, null);
        counter++;
        id = counter;

    }

    @Override
    public double berechneVerbrauchPro100Km() {
        return 0;
    }

    @Override
    protected double kmProLiter() {
        return 0.0;
    }

    @Override
    public String toString() {
        if (id == 1) {
            return "Ein EBus " + super.toString();
        } else {
            return "Noch ein EBus " + super.toString();
        }
    }
}
