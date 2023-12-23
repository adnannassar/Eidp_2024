package Array.OneDimArray.Aufgaben;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        aufgabe_001(array1);
        printArray(array1);
        System.out.println();
        System.out.println();


        int[] array4 = new int[8];
        aufgabe_004(array4);
        printArray(array4);

        System.out.println();
        System.out.println();

        int[] array8a = {1,2,3,4,5};
        int[] array8b = {2,4,6,8,10};
        System.out.println("{1,2,3,4,5}  Alle Gerade? --> "+ aufgabe_008(array8a));
        System.out.println("{2,4,6,8,10} Alle Gerade? --> "+ aufgabe_008(array8b));
    }

    public static void aufgabe_001(int[] array) {
        System.out.println("Aufgabe_001");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(2, i);
        }
    }

    public static void aufgabe_004(int[] array) {

        System.out.println("Aufgabe_004");
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1,50);
        }
    }

    public static boolean aufgabe_008(int[] array) {
        System.out.println("Aufgabe_008");
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
