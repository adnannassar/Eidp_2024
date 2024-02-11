package Klausuren.Probeklausur.Aufgabe_003;

public class Aufgabe_003 {
    public static void main(String[] args) {
        String originalString = "abc";
        String reversedString = spiegeln(originalString);
        System.out.println("Original: " + originalString + " | Reversed: " + reversedString);


    }
    public static String spiegeln(String w) {
        String reversed = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            reversed += w.charAt(i);
        }
        return reversed;
    }

    public static String erhoeheUm2(String a) {
        char[] chars = a.toCharArray();
        int number = 2;

        for (int i = a.length() - 1; i >= 0; i--) {
            int sum = (chars[i] - '0') + number;
            chars[i] = (char) ('0' + (sum % 10));
            number = sum / 10;
        }

        String result = new String(chars);
        if (number > 0) {
            result = "1" + result;
        }

        return result;
    }


}
