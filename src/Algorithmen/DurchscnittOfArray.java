package Algorithmen;

public class DurchscnittOfArray {
    public static void main(String[] args) {
        int[] array = new int[10]; // {2, 6, 3, 4, 5, 0 ,0, 0 , 0 , 0}
        array[0] = 2;
        array[1] = 6;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println(durchSchnittOneDimArray(array));


        int[][] array2d = {
                {1, 2, 0, 0, 1, 6},
                {0, 2, 0, 0, 10, -1},
                {-1, 2, 3, 4,},
                {8},
        };

        System.out.println(durchSchnittTwoDimArray(array2d));

    }

    public static int durchSchnittOneDimArray(int[] array) {
        int summe = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                counter++;
                summe += array[i];
            }
        }
        return summe / counter;
    }

    public static int durchSchnittTwoDimArray(int[][] array) {
        int summe = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    counter++;
                    summe += array[i][j];
                }
            }

        }
        return summe / counter;
    }

}
