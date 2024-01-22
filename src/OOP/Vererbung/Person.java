package OOP.Vererbung;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return "Person --> " +  name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return 2024 - birthYear;
    }

}
