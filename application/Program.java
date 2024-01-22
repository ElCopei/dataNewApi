package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // cria um formato
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm"); // cria um formato
        LocalDate date = LocalDate.now(); // pega a data do sistema
        String text = date.format(dtf); // transforma a data em uma string no formato passado como argumento
        // LocalDate d = LocalDate.parse(text, dtf); // volta a data para o formato
        //Date d = Date.from(Instant.parse(text));
        LocalDate date2 = date.plusDays(7);
        String text2 = date2.format(dtf);
        // LocalDate d2 = LocalDate.parse(text2, dtf);
        System.out.println("Data do emprestimo: " + text);
        System.out.println("Data de devolução: " + text2);
        // System.out.println(d2);
        LocalDateTime date3 = LocalDateTime.now();
        String text3 = date3.format(dtf1);
        System.out.println("Hora do emprestimo: " + text3);
        Calendar cal = Calendar.getInstance();
        //cal.setTime(d);
    }

}
