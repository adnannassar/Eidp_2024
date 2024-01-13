package Aufgaben.Bruch;

public class Bruch {
   private int zähler, nenner;

    public Bruch() {
        this.zähler = 1;
        this.nenner = 1;

    }

    public Bruch(int zähler, int nenner) {
        this.zähler = zähler;
        this.nenner = nenner;
    }

    public int getZähler() {
        return zähler;
    }

    public int getNenner() {
        return nenner;
    }

    public Bruch kehrwert() {
        Bruch erg = new Bruch(nenner, zähler);
        return erg;
    }

    public Bruch multiplizieren(Bruch newBruch) {
        return new Bruch(this.zähler * newBruch.zähler, this.nenner * newBruch.nenner);
    }

    public Bruch addieren(Bruch b) {
        int gemeinsamNenner = this.nenner * b.nenner;
        int gemeinsamZähler = (this.zähler * b.nenner) + (b.zähler * this.nenner);
        return new Bruch(gemeinsamZähler, gemeinsamNenner);
    }


}
