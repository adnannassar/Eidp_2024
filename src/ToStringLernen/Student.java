package ToStringLernen;

public class Student {
    private String name;
    private String mtrNr;
    private String fachrichtung;
    private int alter;


    public Student(String name, String mtrNr, String fachrichtung, int alter) {
        this.name = name;
        this.mtrNr = mtrNr;
        this.fachrichtung = fachrichtung;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMtrNr() {
        return mtrNr;
    }

    public void setMtrNr(String mtrNr) {
        this.mtrNr = mtrNr;
    }

    public String getFachrichtung() {
        return fachrichtung;
    }

    public void setFachrichtung(String fachrichtung) {
        this.fachrichtung = fachrichtung;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString(){
        return "Name: " + name+ " (" + mtrNr+") " + "Fachrichtung ("+ fachrichtung+") " + "Alter: " + alter;
    }
}
