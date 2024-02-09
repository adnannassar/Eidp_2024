package Klausuren.Klausur_28_07_2023.B;

import Klausuren.Klausur_28_07_2023.A.SonOfTest;

public class Main {
    public static void main(String[] args) {
        System.out.println(teileranzahl(20));
        System.out.println(primzahlzerlegung(36));

    }

    public static int teileranzahl (int n ) {

        int anzahlteiler = 1;

        if (n > 0) {
            for ( int t = 2; t <= n; t++) {
                if ( n % t == 0)
                    anzahlteiler ++;
            }
        }

        return anzahlteiler;
    }

    public static String primzahlzerlegung(int n) {
        String zeichenkette = "";
        boolean first = true;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (first) {
                    zeichenkette += i;
                    first = false;
                } else {
                    zeichenkette += "*" + i;
                }
                n /= i;
            }
        }
        return zeichenkette;
    }
}
