package OOP.Vererbung;

public class Student extends Person {
    private int mtrNr;

    public Student(String name, int birthYear, int mtrNr) {
        super(name, birthYear);
        this.mtrNr = mtrNr;
    }

    public int getMtrNr() {
        return mtrNr;
    }

    @Override
    public String getName(){
        return "Student --> " + super.getName();
    }

}
