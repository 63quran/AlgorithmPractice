package subjectoneday;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {


    public static void main(String[] args) {
        LocalDateTime DATE = LocalDateTime.now();
        System.out.println(DATE.toString());
        String format = DATE.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format);

    }
}
