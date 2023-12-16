package Aufgaben;

import java.util.Scanner;

public class DosenRechner {
    static double höhe;
    static double radius;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runDosenRechner();
    }

    public static void runDosenRechner() {
        int option;
        do {
            readInput();
            option = sc.nextInt();
            doLogic(option);
        } while (option != 6);
    }

    public static void readInput() {
        System.out.print("\nGeben Sie bitte die Radius und Höhe werte ein:\nHöhe: ");
        höhe = sc.nextDouble();
        System.out.print("Radius: ");
        radius = sc.nextDouble();

        System.out.println("Dosen Rechner Optionen:\n" +
                "1. Umfang\n" +
                "2. DeckelFläche\n" +
                "3. MantelFläche\n" +
                "4. Oberfläche\n" +
                "5. Volumen\n" +
                "6. Exit");
        System.out.print("Bitte eine Option auswählen: ");
    }

    public static void doLogic(int option) {
        switch (option) {
            case 1:
                System.out.println("Umfang: " + umfang());
                break;
            case 2:
                System.out.println("deckelFläche: " + deckelFläche());
                break;
            case 3:
                System.out.println("mantelFläche: " + mantelFläche());
                break;
            case 4:
                System.out.println("oberfläche: " + oberfläche());
                break;
            case 5:
                System.out.println("volumen: " + volumen());
                break;
            case 6:
                System.out.println("Ciao!");
                break;
            default:
                System.out.println("Bitte etwas gültiges eingeben!");
        }
    }

    public static double umfang() {
        return 2 * 3.14 * radius;
    }

    public static double deckelFläche() {
        return 2 * 3.14 * radius * radius;
    }

    public static double mantelFläche() {
        return höhe * umfang();
    }

    public static double oberfläche() {
        return 2 * deckelFläche() + mantelFläche();
    }

    public static double volumen() {
        return deckelFläche() * höhe;
    }


}
