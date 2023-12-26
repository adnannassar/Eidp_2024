package Algorithmen;

import java.util.Scanner;

public class Beispiel {
    public static void main(String[] args) {
        // Algorithm of calculator
        // 1. read number 1
        // 2. read number 2
        // 3. select operation
        // 4. make the calculation
        // 5. display the result!

        // 1. read number 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Nr1: ");
        int nr1 = sc.nextInt();

        // 2. read number 2
        System.out.print("Nr1: ");
        int nr2 = sc.nextInt();

        // 3. select operation
        System.out.print("Operation: (-, +, *, /, %) : " );
        char ope = sc.next().charAt(0);


      switch (ope){
          // 4. make the calculation
          // 5. display the result!
          case '+' :
              System.out.println(nr1+ nr2); break;

          // 4. make the calculation
          // 5. display the result!
          case '-' :
              System.out.println(nr1 - nr2); break;

          // 4. make the calculation
          // 5. display the result!
          case '*' :
              System.out.println(nr1 *  nr2); break;

          // 4. make the calculation
          // 5. display the result!
          case '/' :
              System.out.println(nr1 /  nr2); break;

          // 4. make the calculation
          // 5. display the result!
          case '%' :
              System.out.println(nr1 %  nr2); break;
          default:
              System.out.println("Bitte eine gültiges Operation auswählen");
      }
    }




}
