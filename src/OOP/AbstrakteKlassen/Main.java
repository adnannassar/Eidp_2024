package OOP.AbstrakteKlassen;

public class Main {

    public static void main(String[] args) {
        Rectangle r = new Rectangle("blue", "Rectangle", 10, 20);

        Circle c = new Circle("green", "Circle", 10);

        Triangle t = new Triangle("yellow", "Triangle", 10, 20, 30);

        Square s = new Square("black", "Square", 10);


        System.out.println(r.berechneFläche());
        System.out.println(c.berechneFläche());
        System.out.println(t.berechneFläche());
        System.out.println(s.berechneFläche());
    }
}
