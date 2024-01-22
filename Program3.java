import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class Program3 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        String dia;
        String mes;
        String ano;
        System.out.println("Digite o dia: ");
        dia = sc.nextLine();
        System.out.println("Digite o mes: ");
        mes = sc.nextLine();
        System.out.println("Digite o ano: ");
        ano = sc.nextLine();
        String data = ano + mes + dia;
        LocalDate parsedDate = LocalDate.parse(data, dtf);
        System.out.println(parsedDate);
        String text = parsedDate.format(dtf1);
        System.out.println(text);
        Instant i = Instant.now();
        System.out.println(i);
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        System.out.println(zdt.getMonth());
        Month month = zdt.getMonth();
        System.out.println(month);
        int m = parsedDate.getMonthValue();
        System.out.println(m);

    }
}
