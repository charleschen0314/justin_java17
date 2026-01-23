package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;

public class TaiwanGovCalendar2025 {

    // 設定 2025 年國定假日
    private static final Set<LocalDate> holidays = new HashSet<>(Arrays.asList(
            LocalDate.of(2025, 1, 1),   // 元旦
            LocalDate.of(2025, 1, 27),  // 小年夜
            LocalDate.of(2025, 1, 28),  // 除夕
            LocalDate.of(2025, 1, 29),  // 春節初一
            LocalDate.of(2025, 1, 30),
            LocalDate.of(2025, 1, 31),
            LocalDate.of(2025, 2, 1),
            LocalDate.of(2025, 2, 2),   // 春節連假
            LocalDate.of(2025, 2, 28),  // 和平紀念日
            LocalDate.of(2025, 4, 4),   // 兒童節
            LocalDate.of(2025, 4, 5),   // 清明節
            LocalDate.of(2025, 5, 1),   // 勞動節
            LocalDate.of(2025, 5, 31),  // 端午節
            LocalDate.of(2025, 9, 28),  // 教師節 (孔子誕辰紀念日)
            LocalDate.of(2025, 10, 10), // 國慶日
            LocalDate.of(2025, 10, 25), // 光復節暨古寧頭大捷紀念日
            LocalDate.of(2025, 12, 25)  // 行憲紀念日
    ));

    public static void main(String[] args) throws IOException {
        StringBuilder html = new StringBuilder();
        html.append("<html><head><meta charset='UTF-8'>");
        html.append("<style>");
        html.append("table { border-collapse: collapse; margin: 20px; float: left; }");
        html.append("th, td { border: 1px solid #999; padding: 5px; text-align: center; }");
        html.append("th { background: #eee; }");
        html.append(".holiday { background: #ffcccc; }");
        html.append(".weekend { background: #f0f0f0; }");
        html.append("</style></head><body>");
        html.append("<h1>2025 年 行政院人事行政總處 辦公日曆表</h1>");

        for (int month = 1; month <= 12; month++) {
            YearMonth ym = YearMonth.of(2025, month);
            html.append("<table>");
            html.append("<caption>").append(month).append(" 月</caption>");
            html.append("<tr>");
            html.append("<th>一</th><th>二</th><th>三</th><th>四</th><th>五</th><th>六</th><th>日</th>");
            html.append("</tr><tr>");

            int firstDay = ym.atDay(1).getDayOfWeek().getValue(); // 星期幾（1=Mon,...7=Sun）
            int lengthOfMonth = ym.lengthOfMonth();

            // 補空白
            for (int i = 1; i < firstDay; i++) {
                html.append("<td></td>");
            }

            for (int day = 1; day <= lengthOfMonth; day++) {
                LocalDate date = ym.atDay(day);
                boolean isHoliday = holidays.contains(date);
                boolean isWeekend = (date.getDayOfWeek().getValue() >= 6);

                String cssClass = "";
                if (isHoliday) cssClass = "holiday";
                else if (isWeekend) cssClass = "weekend";

                html.append("<td class='" + cssClass + "'>")
                        .append(day)
                        .append("</td>");

                if (date.getDayOfWeek().getValue() == 7) {
                    html.append("</tr><tr>");
                }
            }

            html.append("</tr></table>");
        }

        html.append("</body></html>");

        try (FileWriter writer = new FileWriter("calendar2025.html")) {
            writer.write(html.toString());
        }

        System.out.println("已產生 calendar2025.html，請用瀏覽器開啟查看。");
    }
}
