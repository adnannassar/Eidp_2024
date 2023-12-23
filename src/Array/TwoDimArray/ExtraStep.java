package Array.TwoDimArray;

public class ExtraStep {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9, 10},
        };
        printArray(array);

        System.out.println();
        int[][] array2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        printArray(array2);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
