package Array.TwoDimArray.Aufgaben;

public class A_Muster {
    public static void main(String[] args) {
        char[][] array = new char[5][5];

        fillWithAMuster(array);
        if (array.length % 2 != 0) {
            printArray(array);
        }


    }

    public static void fillWithAMuster(char[][] array) {
        if (array.length % 2 != 0) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) {
                        array[i][j] = 'A';
                    } else {
                        array[i][j] = ' ';
                    }
                }
            }
        } else {
            System.out.println("A muster funktioniert nur für Arrays mit ungerade Länge");
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
