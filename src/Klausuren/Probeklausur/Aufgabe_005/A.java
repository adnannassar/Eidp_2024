package Klausuren.Probeklausur.Aufgabe_005;

public class A {
    public int i = 10;

    public A(int i) {
        this.i = i;
    }

    public String toString() {
        return "A: " + i;
    }


    public boolean check() {
        System.out.println(i);
        return true;
    }
}
