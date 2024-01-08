package OOP.Assozazion;

import java.time.LocalTime;
import java.util.Date;

public class TelefonNr {
    private String erreichbarkeit;
    private String nummer;

    public TelefonNr(String erreichbarkeit, String nummer) {
        this.erreichbarkeit = erreichbarkeit;
        this.nummer = nummer;
    }

    public String getErreichbarkeit() {
        return erreichbarkeit;
    }

    public void setErreichbarkeit(String erreichbarkeit) {
        this.erreichbarkeit = erreichbarkeit;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }
}
