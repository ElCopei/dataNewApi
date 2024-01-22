import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate hj = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println("Digite o dia em que você nasceu: ");
        String day = sc.nextLine();
        System.out.println("Digite o mês em que você nasceu: ");
        String month = sc.nextLine();
        System.out.println("Digite o ano em que você nasceu: ");
        String year = sc.nextLine();
        String date = year+month+day;
        LocalDate parsedDate = LocalDate.parse(date,dtf);
        System.out.println(parsedDate);
        //int yearToday = hj.getYear();
        //int monthToday =hj.getMonthValue();
        //int dayToday = hj.getDayOfMonth();
        long diasDeVida = ChronoUnit.DAYS.between(parsedDate, hj);
        long mesesDeVida = ChronoUnit.MONTHS.between(parsedDate, hj);
        long anosDeVida = ChronoUnit.YEARS.between(parsedDate, hj);
        System.out.println("Você viveu até agora: ");
        System.out.println(anosDeVida+" anos");
        System.out.println(mesesDeVida%12+" meses");
        System.out.println(diasDeVida%30+" dias");
    }
}
