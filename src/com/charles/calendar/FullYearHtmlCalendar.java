package com.charles.calendar;

import java.io.IOException;
import java.nio.file.*;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class FullYearHtmlCalendar {

    public static void main(String[] args) throws IOException {
        int year = 2026;
        String html = generateFullYearCalendar(year, Locale.TAIWAN); // 可改成 Locale.ENGLISH
        Files.writeString(Paths.get("calendar_" + year + ".html"), html);
        System.out.println("已產生整年度 HTML 行事曆：calendar_" + year + ".html");
    }

    public static String generateFullYearCalendar(int year, Locale locale) {
        StringBuilder sb = new StringBuilder();

        sb.append("<!DOCTYPE html>\n<html>\n<head>\n");
        sb.append("<meta charset=\"UTF-8\">\n");
        sb.append("<title>").append(year).append(" 年行事曆</title>\n");
        sb.append("<style>\n");
        sb.append("body { font-family: sans-serif; }\n");
        sb.append(".calendar-container { display: flex; flex-wrap: wrap; justify-content: center; }\n");
        sb.append(".month { border: 1px solid #aaa; margin: 10px; padding: 10px; width: 250px; }\n");
        sb.append("table { width: 100%; border-collapse: collapse; }\n");
        sb.append("th, td { border: 1px solid #ccc; text-align: center; height: 30px; }\n");
        sb.append("th { background-color: #f0f0f0; }\n");
        sb.append("h3 { text-align: center; margin: 0 0 10px 0; }\n");
        sb.append("</style>\n</head>\n<body>\n");

        sb.append("<h1>").append(year).append(" 年行事曆</h1>\n");
        sb.append("<div class=\"calendar-container\">\n");

        for (int month = 1; month <= 12; month++) {
            sb.append(generateMonthTable(year, month, locale));
        }

        sb.append("</div>\n</body>\n</html>");
        return sb.toString();
    }

    public static String generateMonthTable(int year, int month, Locale locale) {
        YearMonth ym = YearMonth.of(year, month);
        LocalDate firstDay = ym.atDay(1);
        int daysInMonth = ym.lengthOfMonth();
        int startDayOfWeek = firstDay.getDayOfWeek().getValue() % 7; // Sunday = 0

        String monthName = firstDay.getMonth().getDisplayName(TextStyle.FULL, locale);

        StringBuilder sb = new StringBuilder();
        sb.append("<div class=\"month\">\n");
        sb.append("<h3>").append(monthName).append(" ").append(year).append("</h3>\n");
        sb.append("<table>\n<tr>");

        // 中文版標題（可根據 locale 切換）
        if (locale.getLanguage().equals("zh")) {
            sb.append("<th>日</th><th>一</th><th>二</th><th>三</th><th>四</th><th>五</th><th>六</th>");
        } else {
            sb.append("<th>Sun</th><th>Mon</th><th>Tue</th><th>Wed</th><th>Thu</th><th>Fri</th><th>Sat</th>");
        }
        sb.append("</tr>\n<tr>");

        // 前置空格
        for (int i = 0; i < startDayOfWeek; i++) {
            sb.append("<td></td>");
        }

        // 日期填入
        int day = 1;
        for (int i = startDayOfWeek; i < 7; i++) {
            sb.append("<td>").append(day).append("</td>");
            day++;
        }
        sb.append("</tr>\n");

        while (day <= daysInMonth) {
            sb.append("<tr>");
            for (int i = 0; i < 7; i++) {
                if (day <= daysInMonth) {
                    sb.append("<td>").append(day).append("</td>");
                    day++;
                } else {
                    sb.append("<td></td>");
                }
            }
            sb.append("</tr>\n");
        }

        sb.append("</table>\n</div>\n");
        return sb.toString();
    }
}
