package Algorithmen;

public class DezimalDarstellung {
    public static void main(String[] args) {
        int [] array = dezimalDarstellung(51451035);

        printArrayWithIndexDetails(array);
    }

    public static int[] dezimalDarstellung(int zahl) {
        int length = 0;
        int temp = zahl;
        while (temp > 0) {
            length++;
            temp = temp / 10;
        }

        int[] tempArray = new int[length];

        int i = 0;
        while (zahl > 0) {
            int ziffer = zahl % 10;
            tempArray[i] = ziffer;
            zahl = zahl / 10;
            i++;
        }

        // array umdrehen!
        int [] result = new int[length];
        for(int j = tempArray.length -1 , k = 0 ; j>= 0 ; j--, k++){
            result[k]  = tempArray[j];
        }
        return result;
    }

    public static void printArrayWithIndexDetails(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index "+ (i) +  " = " + array[i]);
        }
        System.out.println();
    }
}


