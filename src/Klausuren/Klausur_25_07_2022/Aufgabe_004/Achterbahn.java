package Klausuren.Klausur_25_07_2022.Aufgabe_004;

public class Achterbahn extends Attraktion {

    public Achterbahn() {
        super(250);
    }

    @Override
    public int getAnzahlBesucher() {
        return getÖffnungszeit() * 50;
    }
}
