package OOP.Interfaces.FormExample;

public class Main {

    public static void main(String[] args) {
        Form r = new Rectangle("blue", "Rectangle", 10, 20);

        Form c = new Circle("green", "Circle", 10);

        Form t = new Triangle("yellow", "Triangle", 10, 20, 30);

        Form s = new Square("black", "Square", 10);


        FormsManagement formsManagement = new FormsManagement();
        formsManagement.addForm(s);
        formsManagement.addForm(c);
        formsManagement.addForm(t);
        formsManagement.addForm(r);

        System.out.println(r.berechneFläche());
        System.out.println(c.berechneFläche());
        System.out.println(t.berechneFläche());
        System.out.println(s.berechneFläche());
    }
}
