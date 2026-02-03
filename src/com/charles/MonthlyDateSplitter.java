package com.charles;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MonthlyDateSplitter {

    public static List<String> splitByMonth(LocalDate start, LocalDate end) {
        List<String> ranges = new ArrayList<>();

        LocalDate current = start;

        while (!current.isAfter(end)) {
            YearMonth ym = YearMonth.from(current);
            LocalDate monthStart = (current.equals(start)) ? start : ym.atDay(1);
            LocalDate monthEnd = ym.atEndOfMonth();
            monthEnd = (monthEnd.isAfter(end)) ? end : monthEnd;

            ranges.add(monthStart.toString() + " - " + monthEnd.toString());

            current = monthEnd.plusDays(1);
        }

        return ranges;
    }

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2025, 1, 2);
        LocalDate endDate = LocalDate.of(2025, 12, 25);

        List<String> result = splitByMonth(startDate, endDate);

//        for (String range : result) {
//            System.out.println(range);
//        }
        
        for (int i = 0; i < result.size(); i += 2) {
            System.out.printf("%2d==%s", i, result.get(i));
            if (i + 1 < result.size()) {
                System.out.print(", " + result.get(i + 1));
            }
            System.out.println(); // 換行
        }
        
    
        
        LocalDate d = LocalDate.now(); // 取得今日
        LocalDate d2= LocalDate.of(2020, 1, 17);  //或者自定義一個日期

        System.out.println("today:" + d.toString());      // today:2020-01-17
        System.out.println("year:"  + d.getYear());
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMM");
        String formattedDate1 = d2.format(dtf1);
        System.out.println("yyyy-MM-dd 格式: " + formattedDate1);
        
    }
}
