package Aufgaben;

import java.util.Scanner;

public class Aufgabe_GroßerAlsDreiEingaben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Nr1: ");
        int nr1 = scanner.nextInt();
        System.out.print("Enter Nr2: ");
        int nr2 = scanner.nextInt();
        System.out.print("Enter Nr3: ");
        int nr3 = scanner.nextInt();

        if (nr1 > nr2 && nr1 > nr3) {
            System.out.println(nr1 + " ist großer");
        } else if (nr2 > nr1 && nr2 > nr3) {
            System.out.println(nr2 + " ist großer");
        } else {
            System.out.println(nr3 + " ist großer");
        }
        scanner.close();
    }
}
