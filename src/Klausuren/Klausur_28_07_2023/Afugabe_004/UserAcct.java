package Klausuren.Klausur_28_07_2023.Afugabe_004;

public class UserAcct {
    private final int userId;
    private String username, emailaddress;
    private static int counter ;
    public UserAcct(String username, String emailaddress) {
        this.username = username;
        this.emailaddress = emailaddress;
        counter++;
        userId = counter;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
}
