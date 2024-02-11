package Klausuren.Probeklausur.Aufgabe_005;

public class Test {
    public static void main(String[] args) {
        A test = new A(0);
        do {
            System.out.println(test.toString());
            test = new B();
        } while (test.i < 9);
        System.out.println(test.i < 8 && test.check());
    }
    // INAS
    // 0
    // 10
    // 4

    // Kauthar
    // 0


    // Mohamad
    // 10

    // Souzan
    // 0
    // 10
    // 4
}
