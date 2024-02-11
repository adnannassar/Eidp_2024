package Klausuren.Probeklausur.Aufgabe_007;

public class Gebäude {
    private String adresse;
    private float gesamtfläche; // 650qm

    private Raum[] räume = new Raum[10]; // 100 , 50, 200 --> 350

    public Gebäude(String adresse, float gesamtfläche) {
        this.adresse = adresse;
        this.gesamtfläche = gesamtfläche;
    }

    public float getGesamtfläche() {
        return gesamtfläche;
    }

    public int getAnzahlRäume() {
        int counter = 0;
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public boolean addRaum(Raum raum) {
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] == null && raum.berechneFläche() <= gesamtfläche) {
                räume[i] = raum;
                gesamtfläche = gesamtfläche - raum.berechneFläche();
                return true;
            }
        }
        return false;
    }

    public float brechenRaumFläche() {
        float summe = 0;
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] != null) {
                summe += räume[i].berechneFläche();
            }
        }
        return summe;
    }

    public float brechenWohnFläche() {
        float summe = 0;
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] != null && räume[i] instanceof Wohnraum) {
                summe += räume[i].berechneFläche();
            }
        }
        return summe;
    }


}
