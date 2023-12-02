package ControlStructure.Loops.While;

public class WhileTest {
    public static void main(String[] args) {
        System.out.print("Absteigend: ");
        int x = 1;
        while (x <= 5) {
            System.out.print(x + " ");
            x++;
        }

        System.out.println();
        System.out.print("Aufsteigend: ");
        int x2 = 5;
        while (x2 >= 1) {
            System.out.print(x2 + " ");
            x2--;
        }

        System.out.println();
        System.out.print("Gerade zwischen 0 und 10: ");
        int x3 = 0;
        while (x3 <= 10) {
            System.out.print(x3 + " ");
            x3 += 2;
        }

        System.out.println();
        System.out.print("Ungerade zwischen 0 und 10: ");
        int x4 = 1;
        while (x4 <= 10) {
            System.out.print(x4 + " ");
            x4 += 2;
        }
    }
}
