package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
public class Program2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        //Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        Date d = Date.from(Instant.now());
        LocalDateTime d2 = LocalDateTime.now();
        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}
