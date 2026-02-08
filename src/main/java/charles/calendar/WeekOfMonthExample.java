package charles.calendar;

import java.util.Calendar;
import java.util.Date;

public class WeekOfMonthExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, Calendar.AUGUST, 27);  // 月份是從 0 開始的（0=一月, 1=二月,...）

        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        System.out.println("2025/08/27 是這個月的第 " + weekOfMonth + " 週");
    }
}
