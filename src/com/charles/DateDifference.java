package com.charles;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class DateDifference {
    public static void main(String[] args) {
        // Define two dates
        LocalDate startDate = LocalDate.of(2025, 6, 18);
        LocalDate endDate = LocalDate.of(2025, 10, 31);

        // Calculate difference in days
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        // Calculate difference in years, months, and days
        Period period = Period.between(startDate, endDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Output results
        System.out.println("Days between: " + daysBetween);
        System.out.println("Difference: " + years + " years, " + months + " months, " + days + " days");
    }
}
