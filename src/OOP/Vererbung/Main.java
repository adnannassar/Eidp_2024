package OOP.Vererbung;

public class Main {
    public static void main(String[] args) {
        Person p =  new Person("Duaa" , 2000);
        Student s = new Student("Hala", 2001, 123456);
        Professor professor = new Professor("Inas", 2002, 1, 3000);
        Dekan d = new Dekan("Kauthar", 2002, 2,5500,"Informatik");



        System.out.println(p.getName() + ", Age: " + p.getAge());

        System.out.println(s.getName() + ", Age: " + s.getAge()+
                ", MTRNr: " + s.getMtrNr());

        System.out.println(professor.getName() + ", Age: " + professor.getAge()+
                ", ID: " + professor.getId()+", Gehalt: " + professor.getGehalt());

        System.out.println(d.getName() + ", Age: " + d.getAge()+
                ", ID: " + d.getId()+", Gehalt: " + d.getGehalt()+", Fachbereich: " + d.getFachbereich());


    }
}
