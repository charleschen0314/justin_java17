package charles;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class FirstAndLastDayOfMonths {
    public static void main(String[] args) {
        int year = 2025; // Change this to your desired year

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        for (int month = 1; month <= 12; month++) {
            YearMonth yearMonth = YearMonth.of(year, month);

            LocalDate firstDay = yearMonth.atDay(1);
            LocalDate lastDay = yearMonth.atEndOfMonth();
            
            String firstDayOfMonth = firstDay.format(dtf);
            String lastDayOfMonth = lastDay.format(dtf);

            System.out.println("  First Day: " + firstDay);
            System.out.println("  Last  Day: " + lastDay);
            System.out.println("  First Day: " + firstDayOfMonth);
            System.out.println("  Last  Day: " + lastDayOfMonth);
        }
    }
}
