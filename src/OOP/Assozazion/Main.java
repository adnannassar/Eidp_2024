package OOP.Assozazion;

public class Main {
    public static void main(String[] args) {
        Address myAdresse = new Address("Teststr", "12345", "Dortmund", 20);
        TelefonNr arbeitNr1 = new TelefonNr("08:00" , "0157512398123");
        TelefonNr arbeitNr2 = new TelefonNr("08:00" , "0157512398124");
        TelefonNr privateNr1 = new TelefonNr("17:30" , "0231912797125");


        Person p = new Person("Adnan", 30, myAdresse, 4);
        p.addTelefonNr(arbeitNr1);
        p.addTelefonNr(arbeitNr2);
        p.addTelefonNr(privateNr1);

        System.out.println("Person: ");
        System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Age: " + p.getAge());
        System.out.println("Address: " + p.getAddress().getStraße() + "." + p.getAddress().getHauseNr() + " " + p.getAddress().getPlz() + " / " + p.getAddress().getOrt());
        p.printTelefonNumbers();
    }
}
