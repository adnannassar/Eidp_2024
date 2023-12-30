package Array.TwoDimArray.Aufgaben;

public class Muster_1_2_3_4 {
    public static void main(String[] args) {
        char[][] array = new char[9][9];

        fillWith1_2_3_4_Muster_Inas(array);

        printArray(array);

        System.out.println();
        char[][] array1 = new char[9][9];

        fillWith1_2_3_4_Muster_Kauthar(array1);

        printArray(array1);

        System.out.println();
        char[][] array2 = new char[9][9];

        fillWith1_2_3_4_Muster_Adnan(array2);

        printArray(array2);

    }

    public static void fillWith1_2_3_4_Muster_Inas(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = '*';
                } else if (i + j == array.length - 1) {
                    array[i][j] = '*';
                } else if (i > 0 && i < array.length - 1 && j < array.length / 2 && j < i && i + j < array.length) {
                    array[i][j] = '4';
                } else if (j > 0 && j < array.length - 1 && i < array.length / 2 && i < j && i + j < array.length) {
                    array[i][j] = '1';
                } else if (i > 0 && i < array.length - 1 && j > array.length / 2 && j > i) {
                    array[i][j] = '2';
                } else if (j > 0 && j < array.length - 1 && i > array.length / 2 && i > j) {
                    array[i][j] = '3';
                }
            }
        }


    }

    public static void fillWith1_2_3_4_Muster_Kauthar(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = '*';
                } else if (i + j == array.length - 1) {
                    array[i][j] = '*';
                } else if (i > 0 && i < array.length - 1 && j < array.length / 2 && j < i && j < array.length - i) {
                    array[i][j] = '4';
                } else if (j > 0 && j < array.length && i < array.length / 2 && i < array.length - j) {
                    array[i][j] = '1';
                } else if (j > 0 && j < array.length && i > array.length / 2 && i > j) {
                    array[i][j] = '3';
                } else if (i > 0 && i < array.length - 1 && j > array.length / 2 && j > i) {
                    array[i][j] = '2';
                }
            }
        }
    }

    public static void fillWith1_2_3_4_Muster_Adnan(char[][] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j || i + j == len - 1) {
                    array[i][j] = '*';
                } else if (i < j && j < len - i) {
                    array[i][j] = '1';
                } else if (i > j && j > len - 1 - i) {
                    array[i][j] = '3';
                } else if (i < j) {
                    array[i][j] = '2';
                } else {
                    array[i][j] = '4';
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
