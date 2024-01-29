package Date;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date: " + date);

        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: " + localDate);


        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime: " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);
    }
}
