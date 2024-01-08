package OOP.Classes;

public class Example {
    public static void main(String[] args) {
        Student s1 = new Student( "Mohamad");
        s1.setNote(1.0f);
        System.out.println(s1.getName());

        Student s2 = new Student("Suad");
        System.out.println(s2.getName());


        Student[] array = {s1, s2};

        for (int i = 0; i < array.length; i++) {
            array[i].printStudentInfo();
        }
    }
}
