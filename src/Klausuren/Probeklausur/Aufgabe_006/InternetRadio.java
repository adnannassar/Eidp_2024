package Klausuren.Probeklausur.Aufgabe_006;


public class InternetRadio extends Gerät implements IPGerät {
    private String ipAdresse;
    private Sender[] senders = new Sender[100];

    public InternetRadio(int id, String hersteller, String ipAdresse) {
        super(id, hersteller);
        this.ipAdresse = ipAdresse;
    }

    public int getAnzahlFavorite() {
        int counter = 0;
        for (int i = 0; i < senders.length; i++) {
            if (senders[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public int addFavorite(String bezeichnung, String genre) {
        for (int i = 0; i < senders.length; i++) {
            if (senders[i] == null) {
                Sender s = new Sender(bezeichnung, genre);
                senders[i] = s;
                return i;
            }
        }
        return -1;
    }

    public boolean removeFavorite() {
        if (senders[0] != null) {
            for (int i = 1; i < senders.length; i++) {
                senders[i - 1] = senders[i];
            }
            return true;
        }
        return false;
    }

    public Sender getFavorit(int index) {
        if (index >= 0 && index < senders.length) {
            return senders[index];
        }
        return null;
    }

    public void ausgabeFavoriten() {
        for (int i = 1; i < senders.length; i++) {
            if (senders[i] != null) {
                System.out.println(senders[i].getBezeichnung() + ", " + senders[i].getGenre());
            }
        }
    }

    @Override
    public String getIPAdresse() {
        return ipAdresse;
    }
}
