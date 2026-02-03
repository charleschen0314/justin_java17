package com.charles.calendar;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeekOfMonthExample2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 8, 27);
        WeekFields weekFields = WeekFields.of(Locale.getDefault());

        int weekOfMonth = date.get(weekFields.weekOfMonth());

        System.out.println("2025/08/27 是這個月的第 " + weekOfMonth + " 週");
        
//        你可以根據需要使用 Locale 自訂週起始日，例如：
//        WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 1);
    }
}
