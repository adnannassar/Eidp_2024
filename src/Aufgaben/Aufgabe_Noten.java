package Aufgaben;

import java.util.Scanner;

public class Aufgabe_Noten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Note eingeben: ");
        float note = scanner.nextFloat();

        if (note >= 0 && note <= 2) {
            System.out.println("A");
        } else if (note > 2 && note <= 4) {
            System.out.println("B");
        } else if (note > 4 && note <= 6) {
            System.out.println("C");
        } else if (note > 6 && note <= 8) {
            System.out.println("D");
        } else if (note > 8 && note <= 10) {
            System.out.println("E");
        } else {
            System.out.println("Note ungültig!");
        }
        scanner.close();
    }
}
