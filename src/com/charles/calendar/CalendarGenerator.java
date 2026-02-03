package com.charles.calendar;


//		August 2025
//		Su Mo Tu We Th Fr Sa
//		          1  2 
//		3  4  5  6  7  8  9 
//		10 11 12 13 14 15 16 
//		17 18 19 20 21 22 23 
//		24 25 26 27 28 29 30 
//		31                  


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarGenerator {

    public static void main(String[] args) {
        int year = 2025;
        int month = 8;

        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDayOfMonth = yearMonth.atDay(1);
        int lengthOfMonth = yearMonth.lengthOfMonth();

        // 標題：月份與年份
        String monthYear = firstDayOfMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " " + year;
        System.out.printf("%n      %s%n", monthYear);

        // 星期標題（星期日到星期六）
        System.out.println("Su Mo Tu We Th Fr Sa");

        // 找出第一天是星期幾
        int dayOfWeekValue = firstDayOfMonth.getDayOfWeek().getValue(); // 1=Monday ... 7=Sunday

        // 我們要以「星期日」開始，所以先轉換成 0~6 的偏移（0=Sunday）
        int shift = (dayOfWeekValue % 7);  // Sunday -> 0, Monday -> 1, ..., Saturday -> 6

        // 印出空白對齊第一天
        for (int i = 0; i < shift; i++) {
            System.out.print("   ");
        }

        // 印出日期
        for (int day = 1; day <= lengthOfMonth; day++) {
            System.out.printf("%2d ", day);

            // 每週換行
            if ((day + shift) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println(); // 最後一行換行
    }
}

//若你想要支援其他語系（例如中文），也可以改這一行：

//String monthYear = firstDayOfMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.TAIWAN) + " " + year;

