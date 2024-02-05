package Klausuren.Klausur_22_07_2019.Aufgabe_007;

public class MediaPlayer {
    private int freierSpeicher;
    private Medium[] medien = new Medium[1000];

    public MediaPlayer(int spciherkapazizät) {
        this.freierSpeicher = spciherkapazizät;
    }

    public int getFreierSpeicher() {
        return freierSpeicher;
    }

    public int getAnzahlMedien() {
        int anzahl = 0;
        for (int i = 0; i < medien.length; i++) {
            // if not empty!
            if (medien[i] != null) {
                anzahl++;
            }
        }
        return anzahl;
    }

    public int addMedium(Medium medium) {
        for (int i = 0; i < medien.length; i++) {
            // if empty
            if (medien[i] == null) {
                medien[i] = medium;
                return i;
            }
        }
        return -1;
    }

    public Medium removeMedium(String name) {
        for (int i = 0; i < medien.length; i++) {
            if (medien[i].getName().equals(name)) {
                Medium temp = medien[i];
                medien[i] = null;
                return temp;
            }
        }
        return null;
    }
}
