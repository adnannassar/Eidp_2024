package LoopsAufgaben;

public class Aufgabe_001 {
    public static void main(String[] args) {
        // Aufgabe 001
        System.out.println("Aufgabe 1 ");
        for (int number = 1; number <= 50; number++) {
            System.out.println(number);
        }

        // Aufgabe 002
        int i = 1; // 3 5 7 9 --- > 99
        System.out.println("Aufgabe 2 ");
        while (i <= 100) {
            System.out.println(i);
            i += 2;
        }


        // Aufgabe 003
        int summe = 0;
        for (int x = 1; x <= 5; x++) {
            summe += x;
        }
        System.out.println("Aufgabe 3");
        System.out.println(summe);

        int eingabe = 4;
        int erg = 1;
        for (int x = 1; x <= eingabe; x++) {
            erg *= x;
        }
        System.out.println("Aufgabe 4");
        System.out.println(eingabe + "! = " + erg);
    }
}
