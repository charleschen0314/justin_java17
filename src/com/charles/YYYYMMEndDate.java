package com.charles;

import java.time.LocalDate;
import java.time.YearMonth;

public class YYYYMMEndDate {

	public static void main(String[] args) {

		String[] effperiod = {"99901","99902","99903","99904","99905","99910"};
		for(int i=0;i<effperiod.length;i++) {
			getLastDateOfMonth(effperiod[i]);
		}

	}

	public static void getNow() {
		LocalDate today = LocalDate.now();

		// 西元轉民國
		int rocYear = today.getYear() - 1911;
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();

		// 組成 yyyMMdd
		String rocDate = String.format("%03d%02d%02d", rocYear, month, day);

		System.out.println("now=" + rocDate);

	}

	public static void getLastDateOfMonth(String rocDate) {
//		String rocDate = "99912"; // YYYMMdd
//		rocDate = "9991217"; // YYYMMdd

		// 取 YYYMM
		String rocYearMonth = rocDate.substring(0, 5); // 11312

		// 民國年轉西元年
		int rocYear = Integer.parseInt(rocYearMonth.substring(0, 3));
		int month = Integer.parseInt(rocYearMonth.substring(3, 5));
		int adYear = rocYear + 1911;

		// 取得當月最後一天
		YearMonth ym = YearMonth.of(adYear, month);
		int lastDayofMonth = ym.lengthOfMonth();
		int daysOfYear = ym.lengthOfYear();
//		System.out.println(daysOfYear);

		// 組回民國年月日字串
		String result = String.format("%04d%02d%02d", adYear, month, lastDayofMonth);

		System.out.println(result); // 1131231
	}

}
