package OOP.Mitarbeiterverwaltung;

public class Arbeiter extends Mitarbeiter {
    private double stundenlohn, anzahlStunden, überstundenZuschlag, anzahlÜberstunden;

    public Arbeiter(String name, double stundenlohn, double anzahlStunden, double überstundenZuschlag) {
        super(name);
        this.anzahlStunden = anzahlStunden;
        this.stundenlohn = stundenlohn;
        this.überstundenZuschlag = überstundenZuschlag;
    }

    public void setAnzahlÜberstunden(double anzahlÜberstunden) {
        this.anzahlÜberstunden = anzahlÜberstunden;
    }

    @Override
    public double berechneGehalt() {
        if (anzahlÜberstunden == 0) {
            return stundenlohn * anzahlStunden;
        } else {
            return (stundenlohn * anzahlStunden) + (anzahlÜberstunden * überstundenZuschlag);
        }
    }
}
