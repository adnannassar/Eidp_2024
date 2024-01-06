package OOP.Classes;

public class Student {
    private int id;
    private String name;
    private float note;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
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
