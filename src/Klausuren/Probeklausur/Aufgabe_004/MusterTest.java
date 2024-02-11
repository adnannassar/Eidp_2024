package Klausuren.Probeklausur.Aufgabe_004;

public class MusterTest {
    public static void main(String[] args) {
        for(int i = 4; i<= 15 ; i++){
            Muster muster = new Muster(i);
            muster.fuellenArray();
            muster.druckeFeld();
            System.out.println("\n");
        }

    }
}
