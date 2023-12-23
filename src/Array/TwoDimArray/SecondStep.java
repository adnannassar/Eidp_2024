package Array.TwoDimArray;

public class SecondStep {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        System.out.println("Before fill: ");
        printArray(array);

        fillArrayFromOneToLength(array);
        System.out.println();
        System.out.println("After fill:  ");
        printArray(array);

    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillArrayFromOneToLength(int[][] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = counter;
                counter++;

            }
        }
    }
}
