package OOP.Assozazion;

public class Address {
    private String straße;
    private String plz;
    private String ort;
    private int hauseNr;

    public Address(String straße, String plz, String ort, int hauseNr) {
        this.straße = straße;
        this.plz = plz;
        this.ort = ort;
        this.hauseNr = hauseNr;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getHauseNr() {
        return hauseNr;
    }

    public void setHauseNr(int hauseNr) {
        this.hauseNr = hauseNr;
    }
}
