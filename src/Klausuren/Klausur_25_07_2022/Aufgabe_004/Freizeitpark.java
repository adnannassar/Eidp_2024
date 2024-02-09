package Klausuren.Klausur_25_07_2022.Aufgabe_004;

public class Freizeitpark {
    private Attraktion[] attraktions = new Attraktion[50];
    private PersonalRessource[] personalRessources = new PersonalRessource[200];


    public void addAttraktion(Attraktion attraktion) {
        for (int i = 0; i < attraktions.length; i++) {
            if (attraktions[i] == null) {
                attraktions[i] = attraktion;
                break;
            }
        }
    }

    public void addMitarbeiter(PersonalRessource m, Attraktion attraktion) {
        for (int i = 0; i < personalRessources.length; i++) {
            if (personalRessources[i] == null) {
                personalRessources[i] = m;
                break;
            }
        }


        int postion = 0;
        for (int i = 0; i < attraktions.length; i++) {
            if (attraktions[i] != null && attraktions[i].equals(attraktion)) {
                postion = i;
            }
        }

        Attraktion tempAtr = attraktions[postion];
        if (tempAtr != null) {
            tempAtr.addMitarbeiter(m);
        }
    }


    public double gesamtEinnahmen() {
        double gesamtAnzahlBesucher = 0;
        for (int i = 0; i < attraktions.length; i++) {
            if (attraktions[i] != null) {
                gesamtAnzahlBesucher += attraktions[i].getAnzahlBesucher();
            }
        }
        return gesamtAnzahlBesucher * 40;
    }

    public boolean alleGewinnbringend() {
        double gesamtKosten = 0;
        int gesamtAnzahlStunden = 0;
        for (int i = 0; i < attraktions.length; i++) {
            if (attraktions[i] != null) {
                gesamtAnzahlStunden += attraktions[i].getÖffnungszeit();
            }
        }

        for (int i = 0; i < personalRessources.length; i++) {
            if (personalRessources[i] != null) {
                gesamtKosten += personalRessources[i].getKosten(gesamtAnzahlStunden);
            }
        }

        double rechnung = gesamtEinnahmen() - gesamtKosten;

        if (rechnung > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean istRichtig() {
        for (int i = 0; i < attraktions.length; i++) {
            if (attraktions[i] != null) {
                PersonalRessource[] personalRessources1 = attraktions[i].getPersonalRessources();
                int aufsichtCounter = 0;
                int technikerCounter = 0;
                for (int j = 0; j < personalRessources1.length; j++) {
                    if (personalRessources1[j] instanceof Aufsicht) {
                        aufsichtCounter++;
                    }
                    if (personalRessources1[j] instanceof Techniker) {
                        technikerCounter++;
                    }
                }
                if (aufsichtCounter > 1 || technikerCounter > 2) {
                    return false;
                }
            }
        }
        return true;
    }
}
