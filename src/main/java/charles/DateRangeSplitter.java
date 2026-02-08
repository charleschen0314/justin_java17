package charles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DateRangeSplitter {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2021, 12, 31);
        int intervalDays = 25;

        List<String> intervals = splitDateRange(startDate, endDate, intervalDays);

        for (String range : intervals) {
            System.out.println(range);
        }
    }

    public static List<String> splitDateRange(LocalDate start, LocalDate end, int intervalDays) {
        List<String> result = new ArrayList<>();
        LocalDate currentStart = start;

        while (!currentStart.isAfter(end)) {
            LocalDate currentEnd = currentStart.plusDays(intervalDays - 1);
            if (currentEnd.isAfter(end)) {
                currentEnd = end;
            }

            result.add(currentStart + " 至 " + currentEnd);
            currentStart = currentEnd.plusDays(1);
        }

        return result;
    }
}
