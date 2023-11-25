package ControlStructure.Conidtions;

public class Swtich_Anweisung_Merged {
    public static void main(String[] args) {
        String month = "November";
        switch (month) {
            case "January", "March", "May", "July", "August", "October", "December":
                System.out.println("31 Tage");
                break;
            case "April", "June", "September", "November":
                System.out.println("30 Tage");
                break;
            case "February":
                System.out.println("28 Tage");
                break;
            default:
                System.out.println("Bitte etwas gültiges!");
        }
    }
}
