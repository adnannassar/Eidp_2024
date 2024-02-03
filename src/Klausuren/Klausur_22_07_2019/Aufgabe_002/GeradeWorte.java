package Klausuren.Klausur_22_07_2019.Aufgabe_002;

import java.util.Scanner;

public class GeradeWorte {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] strings = new String[50];

            for (int i = 0; i < strings.length; i++) {
                strings[i] = scanner.next();
            }

            System.out.println("Gerade: ");
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() % 2 == 0) {
                    System.out.println(strings[i]);
                }
            }

            System.out.println("Ungerade: ");
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() % 2 != 0) {
                    System.out.println(strings[i]);
                }
            }
        }
    }
