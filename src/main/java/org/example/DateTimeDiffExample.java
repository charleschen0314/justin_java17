package org.example;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.Period;
import java.time.Duration;

public class DateTimeDiffExample {

    public static void main(String[] args) {
        // 兩個日期時間
        LocalDateTime start = LocalDateTime.of(2020, 5, 15, 10, 30);
        LocalDateTime end = LocalDateTime.now();

        // 先計算年月日的差異
        Period datePart = Period.between(start.toLocalDate(), end.toLocalDate());

        // 將 start 加上 datePart，然後再算時間的差異（時分）
        LocalDateTime adjustedStart = start.plusYears(datePart.getYears())
                .plusMonths(datePart.getMonths())
                .plusDays(datePart.getDays());

        Duration timePart = Duration.between(adjustedStart, end);

        long hours = timePart.toHours();
        long minutes = timePart.toMinutes() % 60;

        // 輸出結果
        System.out.printf("差距為 %d 年 %d 月 %d 日 %d 小時 %d 分鐘%n",
                datePart.getYears(),
                datePart.getMonths(),
                datePart.getDays(),
                hours,
                minutes);
    }
}
