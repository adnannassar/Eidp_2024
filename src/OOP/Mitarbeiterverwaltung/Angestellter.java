package OOP.Mitarbeiterverwaltung;

public class Angestellter extends Mitarbeiter {
    private double grundgehalt, ortZuschlag, zulage;

    public Angestellter(String name, double grundgehalt, double ortZuschlag, double zulage) {
        super(name);
        this.grundgehalt = grundgehalt;
        this.ortZuschlag = ortZuschlag;
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
       return grundgehalt + ortZuschlag + zulage;
    }
}
