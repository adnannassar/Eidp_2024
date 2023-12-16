package Methods;

import java.util.Scanner;

public class Calculator {
    static int nr1;
    static int nr2;
    static char operation;

    public static void main(String[] arg) {
        while (true) {
            readInput();
            calculate();

        }

        // 2022 1 kg for 1000€ (1 g gold is 50€)
        // 2023 1 kg for 1100€ (because 1g gold is 55€)

        // 1. price for amount depends on gold gram price (200g * 50€)
        // 2. status (win, lose, equals)
        // 3. amount of win or lost!
        // 4. exit
        // do while!
    }

    public static void calculate() {
        switch (operation) {
            case '+':
                getResult('+', nr1, nr2);
                break;
            case '-':
                getResult('-', nr1, nr2);
                break;

            case '*':
                getResult('*', nr1, nr2);
                break;

            case '/':
                getResult('/', nr1, nr2);
                break;

            case '%':
                getResult('%', nr1, nr2);
                break;
        }
    }

    public static void readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nr1: ");
        nr1 = sc.nextInt();

        System.out.print("Nr1: ");
        nr2 = sc.nextInt();

        System.out.print("Bitte Operation auswählen (+, - , / , * , %): ");
        operation = sc.next().charAt(0);
    }

    public static void getResult(char operation, int nr1, int nr2) {
        if (operation == '+') {
            System.out.println("Result of " + nr1 + " + " + nr2 + " = " + add(nr1, nr2) + "\n");
        }
        if (operation == '-') {
            System.out.println("Result of " + nr1 + " - " + nr2 + " = " + sub(nr1, nr2) + "\n");
        }
        if (operation == '*') {
            System.out.println("Result of " + nr1 + " * " + nr2 + " = " + mul(nr1, nr2) + "\n");
        }
        if (operation == '/') {
            System.out.println("Result of " + nr1 + " / " + nr2 + " = " + div(nr1, nr2) + "\n");
        }
        if (operation == '%') {
            System.out.println("Result of " + nr1 + " % " + nr2 + " = " + mod(nr1, nr2) + "\n");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return -1;
        }
    }

    public static int mod(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            return -1;
        }
    }


}
