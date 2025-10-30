import java.time.LocalDate;

public class Utils {
    public static String getToday() {
        return LocalDate.now().toString();
    }
}