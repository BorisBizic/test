import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utility {

     private static String getDate(LocalDate now) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd").format(now);
    }

    public static String dateNow() {
        return getDate(LocalDate.now());
    }

}
