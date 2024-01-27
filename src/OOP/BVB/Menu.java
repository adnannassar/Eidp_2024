package OOP.BVB;

import java.util.Scanner;

public class Menu {
    private Mannschaft mannschaft;
    private Scanner scanner;

    public Menu(Mannschaft mannschaft) {
        this.mannschaft = mannschaft;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        char option;
        do {
            mannschaft.printMitgliederInfo();

            System.out.println("\n\nWeiter Aktionen:");
            System.out.println("\t(A)rzt hinzufügen");
            System.out.println("\t(S)pieler hinzufügen");
            System.out.println("\t(T)rainer hinzufügen");
            System.out.println("\t(B)eenden");
            System.out.print("Ihre Eingabe: ");
            option = scanner.next().charAt(0);

            switch (option) {
                case 'A':
                    addArzt();
                    break;

                case 'S':
                    addSpieler();
                    break;

                case 'T':
                    addTrainer();
                    break;

                case 'B':
                    System.out.println("Exit!");
                    break;

                default:
                    System.out.println("Bitte Ihre Eingabe prüfen!");
            }
        } while (option != 'B');

    }

    private void addTrainer() {
        System.out.println("adding new Trainer...");
        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Vorname: ");
        String vorname = scanner.next();

        Trainer trainer = new Trainer(name, vorname);


        System.out.print("Hat " + vorname + " " + name + " einen lieblingsspiele? Y(a), N(ein): ");
        char antwort = scanner.next().charAt(0);

        if (antwort == 'Y') {
            System.out.println("Wählen Sie die ID einen Spieler aus der Liste: ");
            Spieler[] spielers = mannschaft.getAllSpieler();
            for (int i = 0; i < spielers.length; i++) {
                if (spielers[i] != null) {
                    System.out.println("\t" + spielers[i].getVorname() + " " + spielers[i].getName() + ", ID: " + spielers[i].getId());
                }
            }
            int idSelection = scanner.nextInt();
            Spieler lieblingsSpieler = (Spieler) mannschaft.getMitgliedByID(idSelection);

            trainer.setLieblingsSpieler(lieblingsSpieler);
        }

        mannschaft.addMitglied(trainer);
    }

    private void addSpieler() {
        System.out.println("adding new Spieler...");
        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Vorname: ");
        String vorname = scanner.next();

        System.out.print("Spielposition: ");
        String spielposition = scanner.next();

        System.out.print("Anzahl Spieleinsätze pro session: ");
        int anzahlSpieleinsätze = scanner.nextInt();


        Spieler spieler = new Spieler(name, vorname, spielposition, anzahlSpieleinsätze);
        mannschaft.addMitglied(spieler);
        System.out.println(vorname + " " + name + " wurde als Spieler neu hinzugefügt");
    }

    private void addArzt() {
        System.out.println("adding new Arzt...");
        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Vorname: ");
        String vorname = scanner.next();

        System.out.print("Fachrichtung: ");
        String fachrichtung = scanner.next();

        Arzt arzt = new Arzt(name, vorname, fachrichtung);
        mannschaft.addMitglied(arzt);
        System.out.println(vorname + " " + name + " wurde als Arzt neu hinzugefügt");
    }

}
