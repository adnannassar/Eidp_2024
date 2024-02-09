package Klausuren.Klausur_25_07_2022.Aufgabe_004;

public class Theater extends Attraktion {

    public Theater() {
        super(150);
    }

    @Override
    public int getAnzahlBesucher() {
        return getÖffnungszeit() * 200;
    }
}
