package Klausuren.RegalAufgabe;

public class Regal {
    private RegalBrett[] regalBretts = new RegalBrett[10];

    public Regal(RegalBrett r1, RegalBrett r2) {
        if (r1 != null && r2 != null) {
            regalBretts[0] = r1;
            regalBretts[1] = r2;
        }
    }

    public boolean fügeHinzu(Medium medium) {
        for (int i = 0; i < regalBretts.length; i++) {
            if (regalBretts[i] != null && regalBretts[i].getBreite() >= medium.getBreite() &&
                    regalBretts[i].getTragkraft() >= medium.getGewicht()) {
                Medium[] media = regalBretts[i].getMediums();
                for (int j = 0; j < media.length; j++) {
                    if (media[i] == null) {
                        media[i] = medium;
                        regalBretts[i].setTragkraft(regalBretts[i].getTragkraft() - medium.getGewicht());
                        regalBretts[i].setBreite(regalBretts[i].getBreite() - medium.getBreite());
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
