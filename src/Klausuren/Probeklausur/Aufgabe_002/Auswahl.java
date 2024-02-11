package Klausuren.Probeklausur.Aufgabe_002;

import java.util.Scanner;

public class Auswahl {

    public static void zeigeMenu() {
        System.out.println("(1) Zeige die 1. bis 7. eingegebene Zahl");
        System.out.println("(2) Zeige die 8. eingegebene Zahl");
        System.out.println("(3) Zeige die 9. eingegebene Zahl");
        System.out.println("(4) Beende das Programm");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];

        // Read nine integers from the console
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Geben Sie die " + (i + 1) + ". Zahl ein:");
            numbers[i] = scanner.nextInt();
        }

        int option;
        do {
            zeigeMenu(); // Display the menu
            System.out.println("Wählen Sie eine Option:");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Display the first seven numbers
                    for (int i = 0; i < 7; i++) {
                        System.out.println(numbers[i]);
                    }
                    break;
                case 2:
                    // Display the eighth number
                    System.out.println(numbers[7]);
                    break;
                case 3:
                    // Display the ninth number
                    System.out.println(numbers[8]);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Programm wird beendet.");
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Ungültige Option. Bitte wählen Sie 1, 2, 3 oder 4.");
                    break;
            }
        } while (option != 4);

        scanner.close();
    }
}
