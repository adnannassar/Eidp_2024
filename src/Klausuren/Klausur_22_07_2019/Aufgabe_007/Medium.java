package Klausuren.Klausur_22_07_2019.Aufgabe_007;

public abstract class Medium {
    private String name;

    public Medium(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int berechneSpeicherVerbrauch();
}
