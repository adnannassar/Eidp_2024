package Klausuren.Probeklausur.Aufgabe_006;

public abstract class Gerät {
    private int id;
    private String hersteller;

    public Gerät(int id, String hersteller) {
        this.id = id;
        this.hersteller = hersteller;
    }

    public int getId() {
        return id;
    }

    public String getHersteller() {
        return hersteller;
    }
}
