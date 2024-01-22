package OOP.Mitarbeiterverwaltung;

public class Manager extends Mitarbeiter {
    private double festGehalt, provision, umsatz;

    public Manager(String name, double festGehalt, double provision) {
        super(name);
        this.festGehalt = festGehalt;
        this.provision = provision;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }


    @Override
    public double berechneGehalt() {
        return  festGehalt + provision + umsatz;
    }
}
