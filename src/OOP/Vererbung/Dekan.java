package OOP.Vererbung;

public class Dekan extends Professor{
    private String fachbereich;

    public Dekan(String name, int birthYear, int id, double gehalt, String fachbereich){
        super(name, birthYear, id, gehalt);
        this.fachbereich = fachbereich;
    }

    public String getFachbereich() {
        return fachbereich;
    }

    @Override
    public String getName(){
        return "Dekan --> " + super.getName();
    }
}
