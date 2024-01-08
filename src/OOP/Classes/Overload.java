package OOP.Classes;

import javax.swing.text.Style;
import java.util.Scanner;

public class Overload {

    public static float add(int a, float b, int c) {
        System.out.print("First: ");
        return a + b + c;
    }
    public static float add(float b, int a, int c) {
        System.out.print("Second: ");
        return a + b + c;
    }

    public static void print(int number) {
        System.out.println("int: " + number);
    }

    public static void print(float number) {
        System.out.println("float: " + number);
    }

    public static void print(double number) {
        System.out.println("double: " + number);
    }

    public static void print(String text) {
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {
        print(10);
        print(10.50f);
        print(10123123.51231230);
        print("Hallo!");

        System.out.println(add(1, 0.5f, 100));
        System.out.println(add(0.10f, 2, 200));

        System.out.println();
        System.out.println(1);
        System.out.println("Hallo!");

    }
}
