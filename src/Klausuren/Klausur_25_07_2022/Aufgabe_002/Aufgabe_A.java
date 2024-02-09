package Klausuren.Klausur_25_07_2022.Aufgabe_002;

public class Aufgabe_A {

    public static void main(String[] args) {

        int[] feld1 = {1, 1, 2, 9, 8};
        int[] feld2 = {2, 1, 1, 8, 9};

        System.out.println(anzahlElementeKleiner(feld1, 2));
        System.out.println(anzahlElementeLinksGleich(feld1, 1, 5));
        int[] sortedFeld1 = sortiere(feld1);
        int[] sortedFeld2 = sortiere(feld2);

        print(sortedFeld1);
        print(sortedFeld2);

        System.out.println(istPermutation(feld1, feld2));

    }

    public static int anzahlElementeKleiner(int[] feld, int n) {
        int counter = 0;
        for (int i = 0; i < feld.length; i++) {
            if (feld[i] < n) {
                counter++;
            }
        }
        return counter;
    }

    public static int anzahlElementeLinksGleich(int[] feld, int n, int t) {
        if (t >= 0 && t < feld.length) {
            int counter = 0;
            for (int i = 0; i <= t; i++) {
                if (feld[i] == n) {
                    counter++;
                }
            }
            return counter;
        }
        return -1;
    }

    public static int[] sortiere(int[] array) {
        int[] ergArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            ergArray[i] = array[i];
        }

        return ergArray;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean istPermutation(int[] feldA, int[] feldB) {
        if (feldA.length != feldB.length) {
            return false;
        } else {
            sortiere(feldA);
            sortiere(feldB);
            for (int i = 0; i < feldA.length; i++) {
                if (feldA[i] != feldB[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
