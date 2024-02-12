public class Main {
    public static void main(String[] args) {
        char[][] feld = {
                {'C', 'A', 'T', 'Z', 'T', 'C', 'P', 'G'},
                {'C', 'T', 'A', 'T', 'C', 'A', 'A', 'A'},
                {'W', 'R', 'Z', 'F', 'T', 'I', 'T', 'A'},
                {'A', 'C', 'A', 'T', 'G', 'E', 'P', 'Z'},
                {'C', 'A', 'T', 'G', 'I', 'K', 'L', 'O'}
        };
        char[] wort = {'C', 'A', 'T'};

        // Test für wortAnStelle Funktion
        System.out.println("Test für wortAnStelle:");
        System.out.println("Erwartet: true, Ergebnis: " + wortAnStelle(feld, wort, 0, 0));
        System.out.println("Erwartet: false, Ergebnis: " + wortAnStelle(feld, wort, 0, 1));

        // Test für anzahlWort Funktion
        System.out.println("\nTest für anzahlWort:");
        System.out.println("Erwartet: 3, Ergebnis: " + anzahlWort(feld, wort));
    }

   static boolean wortAnStelle(char[][] feld, char[] wort, int z, int s) {
        // Überprüfen, ob das Wort in der Zeile ab der Spalte s passt
        if (s + wort.length > feld[z].length) {
            // Nicht genug Platz für das Wort
            return false;
        }

        // Überprüfe, ob das Wort im Array an der Stelle [z][s] beginnt
        for (int i = 0; i < wort.length; i++) {
            if (feld[z][s + i] != wort[i]){
                return false; // Charakter stimmt nicht überein
            }
        }

        return true; // Das Wort wurde gefunden
    }

   static int anzahlWort(char[][] feld, char[] wort) {
        int count = 0;

        // Durchsuche jede Zeile des Arrays
        for (int z = 0; z < feld.length; z++) {
            // Durchsuche jede Spalte der Zeile, bis es nicht genug Platz für das Wort gibt
            for (int s = 0; s <= feld[z].length - wort.length; s++) {
                if (wortAnStelle(feld, wort, z, s)){
                    count++; // Wenn das Wort gefunden wurde, erhöhe den Zähler
                }
            }
        }

        return count; // Gebe die Anzahl des gefundenen Wortes zurück
    }
}
