package OOP.AbstrakteKlassen;

public class Square extends Form {
    private double length;

    public Square(String color, String name, double length){
        super(color, name);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double berechneFläche() {
        return length * length;
    }
}
