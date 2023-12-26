package Array.TwoDimArray.Aufgaben;

public class Muster_1_2_3_4 {
    public static void main(String[] args) {
        char[][] array = new char[9][9];

        fillWith1_2_3_4_Muster(array);

        printArray(array);

    }

    public static void fillWith1_2_3_4_Muster(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = '*';
                } else if (i + j == array.length - 1) {
                    array[i][j] = '*';
                } else if (i > 0 && i < array.length - 1 && j < array.length/ 2 && j < i) {
                    array[i][j] = '4';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
