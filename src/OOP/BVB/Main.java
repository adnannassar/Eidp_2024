package OOP.BVB;

public class Main {
    public static void main(String[] args) {
        Spieler götze = new Spieler("Götze", "Mario", "Mittelfeld", 5);

        Spieler aubameyang = new Spieler("Aubameyang", "Pierre-Emerik", "Strum", 18);

        Trainer tuchel = new Trainer("Tuchel", "Thomas");
        tuchel.setLieblingsSpieler(aubameyang);

        Arzt braun = new Arzt("Braun", "Markus", "Orthopädie");


        Mannschaft bvb = new Mannschaft("BVB");

        bvb.addMitglied(götze);
        bvb.addMitglied(aubameyang);
        bvb.addMitglied(tuchel);

        bvb.addMitglied(braun);

        bvb.printMitgliederInfo();

    }
}
