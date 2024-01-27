package OOP.BVB;

public class Spieler extends Mitglied {
   private String spielPosition;
   private int anzahlSpielEinsätze;


   public Spieler(String name, String vorname, String spielPosition, int anzahlSpielEinsätze) {
      super(name, vorname);
      this.anzahlSpielEinsätze = anzahlSpielEinsätze;
      this.spielPosition = spielPosition;
   }

   public String getSpielPosition() {
      return spielPosition;
   }

   public void setSpielPosition(String spielPosition) {
      this.spielPosition = spielPosition;
   }

   public int getAnzahlSpielEinsätze() {
      return anzahlSpielEinsätze;
   }

   public void setAnzahlSpielEinsätze(int anzahlSpielEinsätze) {
      this.anzahlSpielEinsätze = anzahlSpielEinsätze;
   }

   @Override
   public double berechneJahresGehalt() {
      return 12 * 180000 + (5000 * anzahlSpielEinsätze);
   }

   @Override
   public String getSonstiges() {
      return "Position: " +  spielPosition + " / Spieleinsätze: " + anzahlSpielEinsätze;
   }

   @Override
   public String getType() {
      return "S";
   }
}
