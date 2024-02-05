public class Main {
    public static void main(String[] args) {
        A b1 = new B();
    }

    static class A {
        protected static int x = 1;
        public int m;

        public A() {
            System.out.println("A");
            this.m = m;
            x++;
        }

        public int get() {
            return getM();
        }

        public int getM() {
            return m;
        }

        public boolean gleich(A a) {
            return a.m == this.m;
        }
    }

    static class B extends A {
        protected int m;
        protected String matrNr = "000000";

        public B() {
            System.out.println("B");
            this.m = m + 1;
            x++;
        }

        public int getM() {
            return m;
        }

        public boolean gleich(A a) {
            boolean erg = getM() == a.getM();
            // Zeitpunkt 1
            return erg;
        }


    }
}
