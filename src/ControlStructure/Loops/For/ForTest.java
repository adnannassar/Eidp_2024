package ControlStructure.Loops.For;

public class ForTest {
    public static void main(String[] args) {
        System.out.print("Absteigend: ");
        for (int x = 1; x <= 5; x++) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.print("Aufsteigend: ");
        for (int x = 5; x >= 1; x--) {
            System.out.print(x + " ");
        }


        System.out.println();
        System.out.print("Gerade zwischen 0 und 10: ");
        for (int x = 0; x <= 10; x += 2) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.print("Ungerade zwischen 0 und 10: ");
        for (int x = 1; x <= 10; x += 2) {
            System.out.print(x + " ");
        }
    }
}
