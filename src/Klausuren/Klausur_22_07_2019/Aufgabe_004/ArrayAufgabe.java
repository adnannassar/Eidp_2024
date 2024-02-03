package Klausuren.Klausur_22_07_2019.Aufgabe_004;

public class ArrayAufgabe {
    public static void main(String[] args) {
        int[] feld = {1, 7, 13, -5, 2, 27, 11, 4, 51};
        teilsummen(feld);
        print(feld);
    }

    public static void teilsummen(int[] feld) {
        assert (feld != null);
        int summeBisher = 0;
        for (int i = 0; i < feld.length; i++) {
            summeBisher += feld[i];
            feld[i] = summeBisher;
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
