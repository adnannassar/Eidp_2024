package ControlStructure.Conidtions;

public class Swtich_Anweisung {
    public static void main(String[] args) {
        String month = "April";
        switch (month) {
            case "January":
                System.out.println("31 Tage");
                break;
            case "February":
                System.out.println("28 Tage");
                break;
            case "March":
                System.out.println("31 Tage");
                break;
            case "April":
                System.out.println("30 Tage");
                break;
            case "May":
                System.out.println("31 Tage");
                break;
            case "June":
                System.out.println("30 Tage");
                break;
            case "July":
                System.out.println("31 Tage");
                break;
            case "August":
                System.out.println("31 Tage");
                break;
            case "September":
                System.out.println("30 Tage");
                break;
            case "October":
                System.out.println("31 Tage");
                break;
            case "November":
                System.out.println("30 Tage");
                break;
            case "December":
                System.out.println("31 Tage");
                break;
            default:
                System.out.println("Bitte etwas gültiges!");
        }
    }
}
