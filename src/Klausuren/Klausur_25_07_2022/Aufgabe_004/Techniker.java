package Klausuren.Klausur_25_07_2022.Aufgabe_004;

public class Techniker implements PersonalRessource{
    @Override
    public double getKosten(int stunden) {
        return stunden * 100;
    }
}
