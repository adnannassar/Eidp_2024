package Aufgaben.Bruch;

public class Main {
    public static void main(String[] args) {
        Bruch b = new Bruch(10, 2);
        Bruch c  = new Bruch(5, 3);

        Bruch ergOfMul = b.multiplizieren(c);
        System.out.println("Erg Of Mul: " + ergOfMul.getZähler() +"/" + ergOfMul.getNenner());

        Bruch ergOfAdd = b.addieren(c);
        System.out.println("Erg Of Add: " + ergOfAdd.getZähler() +"/" + ergOfAdd.getNenner());

        Bruch kehrWert = b.kehrwert();
        System.out.println("Kehrwert: " +kehrWert.getZähler() +"/" + kehrWert.getNenner());



    }
}
