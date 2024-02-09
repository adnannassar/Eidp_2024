package Klausuren.Klausur_25_07_2022.Aufgabe_004;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(); // 30000
        Achterbahn achterbahn = new Achterbahn(); // 12500


        Aufsicht aufsicht1 = new Aufsicht();
        Aufsicht aufsicht2 = new Aufsicht();

        Techniker techniker = new Techniker();
        Techniker techniker2 = new Techniker();

        Verwaltung verwaltung = new Verwaltung();


        Freizeitpark freizeitpark = new Freizeitpark();

        freizeitpark.addAttraktion(theater);
        freizeitpark.addAttraktion(achterbahn);

        freizeitpark.addMitarbeiter(aufsicht1, theater);

        freizeitpark.addMitarbeiter(aufsicht2, achterbahn);

        freizeitpark.addMitarbeiter(techniker, achterbahn);
        freizeitpark.addMitarbeiter(techniker, theater);

        freizeitpark.addMitarbeiter(techniker2, achterbahn);

        freizeitpark.addMitarbeiter(verwaltung, theater);
        freizeitpark.addMitarbeiter(verwaltung, achterbahn);


        System.out.println(freizeitpark.gesamtEinnahmen());
        System.out.println(freizeitpark.alleGewinnbringend());
        System.out.println(freizeitpark.istRichtig());
    }
}
