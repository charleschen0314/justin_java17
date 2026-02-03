package com.charles;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class DateTimeDifference {
    public static void main(String[] args) {
        // 輸入兩個日期時間
//        LocalDateTime startDateTime = LocalDateTime.of(2020, 5, 15, 8, 30);
//        LocalDateTime endDateTime = LocalDateTime.of(2025, 9, 11, 14, 45);

    	LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = LocalDateTime.of(2025, 10, 31, 00, 00);
    	
        // 先計算 Period（年、月、日）
        Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());

        // 將起始日期加上 period 取得新的中間日期
        LocalDateTime intermediate = startDateTime.plusYears(period.getYears())
                                                  .plusMonths(period.getMonths())
                                                  .plusDays(period.getDays());

        // 計算時間差（時、分、秒）
        Duration duration = Duration.between(intermediate, endDateTime);

        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;
        
        
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
//        String sDateTime = sdf.format(startDateTime);
//        String eDateTime = sdf.format(endDateTime);
//        System.out.println(sDateTime+"--"+eDateTime);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String sDateTime = dtf.format(startDateTime);
        String eDateTime = dtf.format(endDateTime);
        System.out.println("sDateTime : "+sDateTime);
        System.out.println("eDateTime : "+eDateTime);

        // 輸出結果
        System.out.printf("相差：%d 年 %d 月 %d 日 %d 小時 %d 分 %d 秒%n",
                period.getYears(), period.getMonths(), period.getDays(), hours, minutes, seconds);
        
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("start time : "+dtf2.format(LocalDateTime.now()));
        long start = System.currentTimeMillis();
        for (int i=0;i<3;i++) {
        	System.out.println(i);
        	try {
//        		TimeUnit.SECONDS.sleep(30);
				Thread.sleep(1*1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }
        System.out.println("end time : "+dtf2.format(LocalDateTime.now()));
        System.out.printf("Sleep time in %d seconds. ", (System.currentTimeMillis() - start)/1000);
    }
}
