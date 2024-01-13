package Aufgaben.Dozent;

public class Main {
     int a;
    public static void main(String[] args) {
        Dozent dieDozentin = new Dozent("Frau Müller", "Informatik", 'F');
        Dozent derDekan = new Dozent("Herr Vollmer", "Informatik", 'M');
        derDekan.setDekan(true  );
        System.out.println("DOZENT 1: ");
        System.out.println(derDekan.getName());
        System.out.println(derDekan.getLehrgebiet());
        System.out.println(derDekan.getGeschlecht());
        System.out.println("Ist Dekan: " + derDekan.isDekan());

        dieDozentin.setLehrgebiet("Mathematik");
        System.out.println("\nDOZENT 2: ");
        System.out.println(dieDozentin.getLehrgebiet());
    }

}
