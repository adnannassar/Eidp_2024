package Array.TwoDimArray.Aufgaben;

public class Rectangle_Muster {
    public static void main(String[] args) {
        char[][] array = new char[11][11];

        fillWithRectangleMuster(array);
        if (array.length % 2 != 0 && array.length == array[0].length) {
            printArray(array);
        }

    }

    public static void fillWithRectangleMuster(char[][] array) {
        if (array.length % 2 != 0 && array.length == array[0].length) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == 0) {
                        array[i][j] = '*';
                    } else if (j == 0) {
                        array[i][j] = '*';
                    } else if (j == array.length - 1) {
                        array[i][j] = '*';
                    } else if (i == array.length - 1) {
                        array[i][j] = '*';
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
