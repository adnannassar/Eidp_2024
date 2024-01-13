package Aufgaben.RaumVerwaltungSystem;

public class Main {
    public static void main(String[] args) {
        Raum r1 = new Raum('C', '2', "30");

        Raum r2 = new Raum('C', '2', "40");
        r2.setNutzer(new Professor("Konstantin Koll"));

        Raum r3 = new Raum('C', '2', "41");
        r3.setNutzer(new Professor("Michael Stark"));

        Raum r4 = new Raum('A', '2', "02");
        Raum r5 = new Raum('A', '2', "03");


        Raumverwaltung raumverwaltung = new Raumverwaltung();
        raumverwaltung.addRaum(r1);
        raumverwaltung.addRaum(r2);
        raumverwaltung.addRaum(r3);
        raumverwaltung.addRaum(r4);
        raumverwaltung.addRaum(r5);


        raumverwaltung.ausgabeRaumList();
    }
}
