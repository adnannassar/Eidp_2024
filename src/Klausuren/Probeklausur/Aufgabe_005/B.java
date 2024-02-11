package Klausuren.Probeklausur.Aufgabe_005;


public class B extends A {
    public int i;
    static int j = 3;

    public B() {
        super(++j);
        i = ++j;
    }

    public String tostring() {
        return "B: " + i;
    }
}
