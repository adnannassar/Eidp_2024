package OOP.Classes;

public class Student {
    private int id;
    private String name;
    private float note;
    private static int counter;

    public Student(String name) {
        this.name = name;
        counter++;
        this.id = counter;
    }

    public static void printHallo() {
        System.out.println("Hallo!");
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNote(float note) {
        this.note = note;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public float getNote() {
        return this.note;
    }

    public int getId() {
        return this.id;
    }


    public void printStudentInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Note: " + note);
    }
}
