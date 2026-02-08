package charles.calendar;

import java.io.IOException;
import java.nio.file.*;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class HtmlCalendarGenerator {

    public static void main(String[] args) throws IOException {
        int year = 2025;
        int month = 8;

        String html = generateHtmlCalendar(year, month);
        Files.writeString(Paths.get("calendar.html"), html); // 輸出到檔案
        System.out.println("HTML 行事曆已產生：calendar.html");
    }

    public static String generateHtmlCalendar(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        LocalDate firstDay = ym.atDay(1);
        int daysInMonth = ym.lengthOfMonth();
        int startDayOfWeek = firstDay.getDayOfWeek().getValue() % 7; // Sunday = 0

        String monthName = firstDay.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        StringBuilder sb = new StringBuilder();

        sb.append("<!DOCTYPE html>\n<html>\n<head>\n");
        sb.append("<meta charset=\"UTF-8\">\n");
        sb.append("<title>").append(monthName).append(" ").append(year).append("</title>\n");
        sb.append("<style>\n");
        sb.append("table { border-collapse: collapse; width: 100%; max-width: 600px; }\n");
        sb.append("th, td { border: 1px solid #999; text-align: center; padding: 8px; }\n");
        sb.append("th { background-color: #f2f2f2; }\n");
        sb.append("td { height: 80px; }\n");
        sb.append("</style>\n");
        sb.append("</head>\n<body>\n");

        sb.append("<h2>").append(monthName).append(" ").append(year).append("</h2>\n");

        sb.append("<table>\n<tr>");
        sb.append("<th>Sun</th><th>Mon</th><th>Tue</th><th>Wed</th><th>Thu</th><th>Fri</th><th>Sat</th>");
        sb.append("</tr>\n<tr>");

        // 前面的空格
        for (int i = 0; i < startDayOfWeek; i++) {
            sb.append("<td></td>");
        }

        // 印出每一天
        int day = 1;
        for (int i = startDayOfWeek; i < 7; i++) {
            sb.append("<td>").append(day).append("</td>");
            day++;
        }
        sb.append("</tr>\n");

        // 接下來的週數
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

        sb.append("</table>\n</body>\n</html>");

        return sb.toString();
    }
    
//    如果你想要中文版本，只要修改以下兩個地方：
//    Locale.TAIWAN
//
//
//    以及：
//
//    <th>日</th><th>一</th><th>二</th><th>三</th><th>四</th><th>五</th><th>六</th>
    
}

