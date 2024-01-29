package OOP.Interfaces.TelefoneExample;

public class SMS {
    private int empfängerID;
    private String text;

    public SMS(int empfängerID, String text) {
        this.empfängerID = empfängerID;
        this.text = text;
    }

    public int getEmpfängerID() {
        return empfängerID;
    }

    public String getText() {
        return text;
    }
}
