package Klausuren.Klausur_25_07_2022.Aufgabe_004;

public class Aufsicht implements PersonalRessource{
    @Override
    public double getKosten(int stunden) {
        return stunden * 30;
    }
}
