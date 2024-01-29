package OOP.Polymorphy.Example;

public class Main {


    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
        a.printX();

    }

    static class A {
        int x = 10;
        static int y = 100;

        public A() {
            System.out.println("X FROM A = " + x);
        }

        void printX() {
            System.out.println(x);
        }
    }

    static class B extends A {
        int x = 20;

        public B() {
            System.out.println("X FROM B = " + x);
        }

        void printX() {
            System.out.println(x);
        }
    }

    static class C extends B {
        int x = 30;

        public C() {
            System.out.println("C");
        }

        void printX() {
            System.out.println(x);
        }
    }
}
