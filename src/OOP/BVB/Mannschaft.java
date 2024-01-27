package OOP.BVB;

public class Mannschaft {

    private String name;
    private Mitglied[] mitglieder = new Mitglied[30];

    public Mannschaft(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMitglied(Mitglied m) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] == null) {
                mitglieder[i] = m;
                break;
            }
        }
    }

    public Mitglied getMitgliedByName(String name) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null && mitglieder[i].getName().equals(name)) {
                return mitglieder[i];
            }
        }
        return null;
    }

    public Mitglied getMitgliedByID(int id) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null && mitglieder[i].getId() == id) {
                return mitglieder[i];
            }
        }
        return null;
    }


    public void printMitgliederInfo() {
        if (mitglieder[0] == null) {
            System.out.println("Es gibt noch keine Mitglieder! Sie können durch die add Funktion hinzufügt werden!");
        } else {

            double summerJahresGehälter = 0;
            System.out.println("\n\n----------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-10s%-20s%-20s%-20s%-20s\n", "Type", "Name", "Vorname", "Jahresgehalt", "Sonstiges");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            for (int i = 0; i < mitglieder.length; i++) {
                if (mitglieder[i] != null) {
                    System.out.printf("%-10s%-20s%-20s%-20.2f%-20s\n",
                            mitglieder[i].getType(),
                            mitglieder[i].getName(),
                            mitglieder[i].getVorname(),
                            mitglieder[i].berechneJahresGehalt(),
                            mitglieder[i].getSonstiges());

                    summerJahresGehälter += mitglieder[i].berechneJahresGehalt();
                }
            }
            System.out.printf("\nSummer der Jahresgehälter: %33.2f\n", summerJahresGehälter);
        }

    }

    public Spieler[] getAllSpieler() {
        Spieler[] spielers = new Spieler[30];
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] != null && mitglieder[i].getType().equals("S")) {
                spielers[i] = (Spieler) mitglieder[i];
            }
        }
        return spielers;
    }
}
