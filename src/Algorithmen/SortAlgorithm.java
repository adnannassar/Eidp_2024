package Algorithmen;

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] array = {7, 2, 5, 3, 9, 0, 100, 4, 6};
        System.out.print("Before: ");
        printArray(array);

        bubbleSort(array);

        System.out.print("After:  ");
        printArray(array);

    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
