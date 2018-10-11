import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.temporal.TemporalAmount;



public class Calendars {
    public final static void main(String []  args) {
        // LocalDateTime d1 = new LocalDateTime(); // NO! Use factory methods.
        LocalDate date1 = LocalDate.of(2017, 1, 31);
        Period month = Period.ofMonths(1);
        LocalDate date2 = date1.plus(month);
        System.out.println(date1);
        System.out.println(date2);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMddyyyy");

        LocalDate date3 = LocalDate.parse("01201934", f); // throws java.time.DateTimeException (RuntimeException)

        System.out.println(date3.getDayOfWeek());

        Period p1 = Period.between(date3, LocalDate.now());

        System.out.println(p1.getYears());
        System.out.println(p1.getMonths());
        System.out.println(p1.getDays());
    }
}

// Factory methods:
// from()
// now()
// of()
// ofEpochDat()
// ofYearDay()
// parse()