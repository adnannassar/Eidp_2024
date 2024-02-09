package Klausuren.Klausur_25_07_2022.Aufgabe_003;

public class Aufgabe_B {


    public static void main(String[] args) {
        int[] feld1 = {3, 2, 1, 4};
        print(diagramm1(feld1));
    }


    public static void print(char[][] feld) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[0].length; j++) {
                System.out.print(feld[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] diagramm1(int[] feld) {
        char[][] erg = new char[4][4];
        for (int i = 0; i < erg.length; i++) {
            for (int j = 0; j < erg[0].length; j++) {

                if (j < feld[i]) {
                    erg[i][j] = '*';
                } else {
                    erg[i][j] = '-';
                }

                if (i == 2 && j == 2) {
                    erg[i][j] = '#';
                }
            }
            System.out.println();
        }
        return erg;
    }
}
