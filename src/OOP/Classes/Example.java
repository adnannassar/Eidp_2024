package OOP.Classes;

public class Example {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Mohamad");

        s1.setName("Mohammad");
        s1.setNote(1.0f);

        Student s2 = new Student(2, "Suad");
        s2.setNote(2.0f);

        Student[] array = {s1, s2};

        for (int i = 0; i < array.length; i++) {
            array[i].printStudentInfo();
        }
    }
}
