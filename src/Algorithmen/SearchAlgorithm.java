package Algorithmen;

public class SearchAlgorithm {
    public static void main(String[] args) {
        int[] array = {2, 7, 5, 1, 0, 9, 100, -2, 3};
        boolean istGefunden = search(array, 4);
        if(istGefunden){
            System.out.println("Gefunden");
        }else{
            System.out.println("Nicht gefunden");
        }
    }

    public static boolean search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

}
