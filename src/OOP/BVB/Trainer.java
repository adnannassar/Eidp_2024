package OOP.BVB;

public class Trainer extends Mitglied {
    private Spieler lieblingsSpieler;


    public Trainer(String name, String vorname) {
        super(name, vorname);
    }

    public void setLieblingsSpieler(Spieler lieblingsSpieler) {
        this.lieblingsSpieler = lieblingsSpieler;
    }

    public Spieler getLieblingsSpieler() {
        return lieblingsSpieler;
    }

    @Override
    public double berechneJahresGehalt() {
        return 12 * 165000;
    }

    @Override
    public String getSonstiges() {
       String erg = "Lieblingsspieler: ";
       if(lieblingsSpieler != null){
           erg+= lieblingsSpieler.getVorname() + " " + lieblingsSpieler.getName();
       }
        return erg;
    }

    @Override
    public String getType() {
        return "T";
    }
}
