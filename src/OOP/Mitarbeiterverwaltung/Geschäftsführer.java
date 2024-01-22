package OOP.Mitarbeiterverwaltung;

public class Geschäftsführer extends Manager {
    private double zulage;

    public Geschäftsführer(String name, double festGehalt, double provision, double zulage) {
        super(name, festGehalt, provision);
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return  super.berechneGehalt() + zulage;
    }
}
