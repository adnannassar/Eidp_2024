package Klausuren.Klausur_25_07_2022.Aufgabe_004;

public abstract class Attraktion {
    private int öffnungszeit;
    private PersonalRessource[] personalRessources;

    private int id;
    private static int counter = 1;

    public Attraktion(int öffnungszeit) {
        this.öffnungszeit = öffnungszeit;
        this.personalRessources = new PersonalRessource[20];
        this.id = counter;
        counter++;
    }


    public void addMitarbeiter(PersonalRessource m) {
        for (int i = 0; i < personalRessources.length; i++) {
            if (personalRessources[i] == null) {
                personalRessources[i] = m;
                break;
            }
        }
    }


    public int getId() {
        return id;
    }

    public abstract int getAnzahlBesucher();

    int getÖffnungszeit() {
        return öffnungszeit;
    }

    public PersonalRessource[] getPersonalRessources() {
        return personalRessources;
    }
}
