package Aufgaben;

import java.util.Scanner;

public class Aufgabe_Rechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nr1: ");
        int nr1 = sc.nextInt();

        System.out.print("Enter Nr2: ");
        int nr2 = sc.nextInt();

        System.out.print("Select Operation (+,-,*,/,%): ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '*':
                System.out.println(nr1 + " * " + nr2 + " = " + nr1 * nr2);
                break;
            case '/':
                System.out.println(nr1 + " / " + nr2 + " = " + nr1 / nr2);
                break;
            case '-':
                System.out.println(nr1 + " - " + nr2 + " = " + (nr1 - nr2));
                break;
            case '+':
                System.out.println(nr1 + " + " + nr2 + " = " + nr1 + nr2);
                break;
            case '%':
                System.out.println(nr1 + " % " + nr2 + " = " + nr1 % nr2);
                break;

            default:
                System.out.println("Falsche Operation");
        }
    }
}
