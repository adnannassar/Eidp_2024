package Datatypes.Ganzzahlen;

public class Ganzzahlen {
    public static void main(String[] args) {
        //byte: 1 byte	Stores whole numbers from -128 to 127
        byte b = 127;
        System.out.println("Byte b = " + b);


        //short: 2 byte	Stores whole numbers from -32,768 to 32,767
        short s = 200;
        System.out.println("short s = " + s);


        // int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int i = 21474865;
        System.out.println("int i = " + i);


        // long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l = 3124086512L;
        System.out.println("long l = " + l);
    }
}
