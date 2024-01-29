package OOP.Interfaces.TelefoneExample;

import java.time.LocalTime;

public class SmartPhone extends Telefon implements Uhr {
    private double displayGröße;

    private SMS[] messages = new SMS[1000];


    public SmartPhone(int id, String rufnummer, double displayGröße) {
        super(id, rufnummer);
        this.displayGröße = displayGröße;
    }

    public double getDisplayGröße() {
        return displayGröße;
    }

    public int getAnzahlSMS() {
        int counter = 0;
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public int addSMS(int empfängerID, String text) {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = new SMS(empfängerID, text);
                return i;
            }
        }
        return -1;
    }

    public void ausgabeSMS() {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                System.out.println(messages[i].getEmpfängerID() + ", " +
                        messages[i].getText());
            }
        }
    }

    @Override
    public LocalTime getUhrZeit() {
        return LocalTime.now();
    }
}
