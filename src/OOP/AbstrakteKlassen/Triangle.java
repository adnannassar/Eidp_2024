package OOP.AbstrakteKlassen;

public class Triangle extends Form {
    private int a, b, c;

    public Triangle(String color, String name, int a, int b, int c) {
        super(color, name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double berechneFläche() {
        return a + b + c;
    }
}
