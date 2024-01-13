package Aufgaben.RaumVerwaltungSystem;

public class Raumverwaltung {
    private Raum[] räume = new Raum[100];

    public Raumverwaltung() {
    }

    public void addRaum(Raum raum) {
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] == null) {
                räume[i] = raum;
                break;
            }
        }
    }

    public void ausgabeRaumList() {
        for (int i = 0; i < räume.length; i++) {
            if (räume[i] != null) {
                if (räume[i].getNutzer() != null) {
                    System.out.println(räume[i].getTrakt() + "." +
                            räume[i].getEtage() + "." + räume[i].getNummer() + ": " + räume[i].getNutzer().getName());
                } else {
                    System.out.println(räume[i].getTrakt() + "." +
                            räume[i].getEtage() + "." + räume[i].getNummer() + ":");
                }
            }

        }
    }
}
