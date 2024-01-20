package OOP.Vererbung;

public class Professor extends Person {
    private int id;
    private double gehalt;

    public Professor(String name, int birthYear, int id, double gehalt){
        super(name, birthYear);
        this.id = id ;
        this.gehalt = gehalt;
    }

    public int getId() {
        return id;
    }

    public double getGehalt() {
        return gehalt;
    }

    @Override
    public String getName(){
        return "Professor --> " + super.getName();
    }
}
