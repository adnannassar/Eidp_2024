package Klausuren.Probeklausur.Aufgabe_006;

public class Sender {
    private String bezeichnung;
    private String genre;

    public Sender(String bezeichnung, String genre) {
        this.bezeichnung = bezeichnung;
        this.genre = genre;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getGenre() {
        return genre;
    }
}
