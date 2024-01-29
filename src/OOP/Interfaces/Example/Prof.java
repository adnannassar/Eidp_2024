package OOP.Interfaces.Example;

public class Prof extends  Person implements CanAnMensaEssen {
    private String fachrichtung;

    public Prof(String name, String fachrichtung) {
        super(name);
        this.fachrichtung = fachrichtung;
    }

    public String getFachrichtung() {
        return fachrichtung;
    }

    public void setFachrichtung(String fachrichtung) {
        this.fachrichtung = fachrichtung;
    }

    @Override
    public void essenInMensa() {
        System.out.println("Ich bin Prof, ich kann an der Mensa essen!");
    }
}
