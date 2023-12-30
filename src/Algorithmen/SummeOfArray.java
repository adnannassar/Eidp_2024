package Algorithmen;

public class SummeOfArray {
    public static void main(String[] args) {
        int [] array = {5,1,5,4};
        System.out.println("Summe = " + berechneSumme(array));
    }

    public static int berechneSumme(int feld[]){
        int summe = 0 ;
        for(int i = 0 ; i<feld.length; i++){
            summe += feld[i];
        }
        return summe;
    }
}
