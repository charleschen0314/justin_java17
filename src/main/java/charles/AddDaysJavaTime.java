package charles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddDaysJavaTime {
    public static void main(String[] args) {
    	
    	String[] dayOfWeekStrings = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
    	
    	int dayOfWeek = 0;
    	
        // 1. 日期
//        LocalDate today = LocalDate.now();
    	LocalDate startDateTime = LocalDate.of(2025, 6, 18);
    	
    	dayOfWeek = startDateTime.getDayOfWeek().getValue();
    	String sDayOfWeek = dayOfWeekStrings[dayOfWeek % 7];
    	System.out.println(sDayOfWeek);

        // 2. 指定的天數
        int daysToAdd = 200; 
        LocalDate futureDate = startDateTime.plusDays(daysToAdd);
        dayOfWeek = futureDate.getDayOfWeek().getValue();
        String fDayOfWeek = dayOfWeekStrings[dayOfWeek % 7];
        System.out.println(fDayOfWeek);

        // 3. 日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 4。结果
        System.out.println("今天日期: " + startDateTime.format(formatter)+"("+sDayOfWeek+")");
        System.out.println("加 " + daysToAdd + " 天後的日期: " + futureDate.format(formatter)+"("+fDayOfWeek+")");
    }
}