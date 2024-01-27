package OOP.BVB;

public abstract class Mitglied {
    private String name, vorname;
    private int id;
    public static int counter;

    public Mitglied(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
        counter++;
        this.id = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public abstract double berechneJahresGehalt();

    public abstract String getSonstiges();

    public abstract String getType();

    public int getId() {
        return id;
    }
}
