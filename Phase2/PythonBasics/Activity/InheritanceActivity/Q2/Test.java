package Phase2.PythonBasics.Activity.InheritanceActivity.Q2;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String inputString1 = "07-01-2018";
        String inputString2 = "09-01-2018";
        LocalDate date1 = LocalDate.parse(inputString1, dtf);
        LocalDate date2 = LocalDate.parse(inputString2, dtf);
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(daysBetween);
    }
}
