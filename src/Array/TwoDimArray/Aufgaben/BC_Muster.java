package Array.TwoDimArray.Aufgaben;

public class BC_Muster {
    public static void main(String[] args) {
        char[][] array = new char[7][7];

        fillWithBCMuster(array);
        if (array.length % 2 != 0 && array.length == array[0].length) {
            printArray(array);
        }

    }

    public static void fillWithBCMuster(char[][] array) {
        if (array.length % 2 != 0 && array.length == array[0].length) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i + j == array.length / 2) {
                        array[i][j] = 'B';
                    } else if (i + j == array.length + array.length / 2 - 1) {
                        array[i][j] = 'B';
                    } else if (j - i == array.length / 2) {
                        array[i][j] = 'C';
                    } else if (i - j == array.length / 2) {
                        array[i][j] = 'C';
                    } else {
                        array[i][j] = ' ';
                    }
                }
            }
        } else {
            System.out.println("Error!");
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
