package OOP.Assozazion;

public class Person {
    private int id;
    private String name;
    private int age;
    private Address address;
    private TelefonNr[] telefonNumbers;

    private static int counter = 1;

    public Person(String name, int age, Address address, int numberOfTelefons) {
        this.id = counter++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.telefonNumbers = new TelefonNr[numberOfTelefons];
        TelefonNr[] tr = new TelefonNr[5]; // {{1231982731, "18:00"},{+23321ß18231, "20:00"},null,null,null}
    }

    public void addTelefonNr(TelefonNr nr) {
        for (int i = 0; i < telefonNumbers.length; i++) {
                if(telefonNumbers[i] == null){
                    telefonNumbers[i] = nr;
                    break;
                }
        }
    }

    public void printTelefonNumbers(){
        for (int i = 0; i < telefonNumbers.length; i++) {
            if(telefonNumbers[i] != null){
                System.out.println("NR" +(i+1) +  ": " + telefonNumbers[i].getNummer() + ", Erreichbar ab "+ telefonNumbers[i].getErreichbarkeit() + " Uhr");
            }
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }


}
