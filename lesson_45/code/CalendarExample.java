import java.time.ZonedDateTime;
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2024, 15,323);

        System.out.println( calendar.getTime());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
