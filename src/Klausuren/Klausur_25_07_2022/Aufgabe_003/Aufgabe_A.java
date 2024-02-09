package Klausuren.Klausur_25_07_2022.Aufgabe_003;

public class Aufgabe_A {


    public static void main(String[] args) {
        int[] feld1 = {1, 1, 2, 9, 8};
        System.out.println(max(feld1));
    }


    public static int max(int[] feld){
        int max = feld[0];
        for (int i = 0; i <feld.length; i++) {
            if(feld[i] > max){
                max = feld[i];
            }
        }
        return max;
    }
}
