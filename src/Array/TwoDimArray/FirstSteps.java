package Array.TwoDimArray;

public class FirstSteps {
    public static void main(String[] args) {
        // daten bekannt!
        int[][] array = {
                {1, 2, 3, 4, 5} ,
                {6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15}
        };

        System.out.println("Array 1: ");
        System.out.println("Length of Array1 = " + array.length);
        System.out.println("Length of line 1 in  Array1 = " + array[0].length);
        System.out.println("Length of line 2 in  Array1 = " + array[1].length);
        System.out.println("Length of line 3 in  Array1 = " + array[2].length);
        System.out.println("Value of index 0,2 in Array 1 = " + array[0][2]);
        System.out.println("Value of index 2,3 in Array 1 = " + array[2][3]);


        // daten unbekannt!
        int[][] array2 = new int[3][3];
        array2[0][0] = 15;
        array2[2][1] = -5;
        // array2[6][0] = -5; // Exception! = Error!

        System.out.println("\nArray 2: ");
        System.out.println("Length of Array2 = " + array2.length);
        System.out.println("Value of index 0 in Array 2 = " + array2[0][0]);
        System.out.println("Value of index 4 in Array 2 = " + array2[2][1]);


    }
}
