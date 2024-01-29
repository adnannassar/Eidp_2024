package OOP.Interfaces.Example;

public class Student extends Person implements CanAnMensaEssen {
    private int mtrNr;

    public Student(String name, int mtrNr) {
        super(name);
        this.mtrNr = mtrNr;
    }

    public int getMtrNr() {
        return mtrNr;
    }

    public void setMtrNr(int mtrNr) {
        this.mtrNr = mtrNr;
    }

    @Override
    public void essenInMensa() {
        System.out.println("Ich bin Student ich esse in Mensa");
    }
}
