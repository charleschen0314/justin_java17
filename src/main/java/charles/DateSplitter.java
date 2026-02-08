package charles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateSplitter {

    public static void main(String[] args) {
        // 範例輸入：起始與結束日期（你可以改用 Scanner 接收輸入）
        String startStr = "2023-01-01";
        String endStr = "2023-12-31";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(startStr, formatter);
        LocalDate endDate = LocalDate.parse(endStr, formatter);

        long totalDays = ChronoUnit.DAYS.between(startDate, endDate);

        if (totalDays <= 90) {
            System.out.println("日期區間未超過90天。總天數：" + totalDays);
        } else {
            System.out.println("日期區間超過90天。總天數：" + totalDays);
            long partSize = totalDays / 24;

            System.out.println("partSize="+partSize);
            
            LocalDate tempStart = startDate;
            for (int i = 1; i <= 24; i++) {
                LocalDate tempEnd = null;
                if (i < 24) {
                    tempEnd = tempStart.plusDays(partSize);
                } else {
                    // 最後一段直接到結束日期
                    tempEnd = endDate;
                }
                
                System.out.printf("第 %2d 區間：%s ~ %s%n", i,
                        tempStart.format(formatter),
                        tempEnd.format(formatter));
                tempStart = tempEnd;
            }
        }
    }
}
