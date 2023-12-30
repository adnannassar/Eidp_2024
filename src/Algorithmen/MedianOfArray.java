package Algorithmen;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 4, 3, 8};
        System.out.println(berechneMedian(array1));
        int[] array2 = {1, 5, 4, 3, 2, 8};
        System.out.println(berechneMedian(array2));
    }

    public static float berechneMedian(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // ungerade
        if (array.length % 2 != 0) {
            return array[array.length / 2];
        }
        else {
            float middle = array[array.length / 2];
            float afterMiddle = array[(array.length / 2) - 1];
            float durchSchnitt = (middle + afterMiddle) / 2;
            return durchSchnitt;
        }
    }
}
