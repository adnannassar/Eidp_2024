package Algorithmen;

public class MergeOfTwoArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 13, 16, 154, 1123};
        int[] b = {0, 4, 24, 25, 100};
      


        int[] erg = mergeWithSortAlgorithm(a, b);
        print(erg);


    }

    public static int[] mergeWithSortAlgorithm(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = a.length, j = 0; i < c.length; i++, j++) {
            c[i] = b[j];
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (c[j] > c[j + 1]) {
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

        return c;
    }


    public static int[] mergeWithPointers(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                k++;
                i++;
            } else {
                result[k] = b[j];
                k++;
                j++;
            }
        }


        while (i < a.length) {
            result[k] = a[i];
            k++;
            i++;
        }

        while (j < b.length) {
            result[k] = b[j];
            k++;
            j++;
        }

        return result;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


}
