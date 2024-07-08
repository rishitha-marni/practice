package oops;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TimeDate {

	public static void main(String[] args) {
		
		//localdatetime and zoneddatetime class is used to get time in nano time in sec 
		LocalDateTime time= LocalDateTime.of(2000, Month.MAY, 16, 9, 30);
		System.out.println(time);
		
		ZonedDateTime time2= ZonedDateTime.of(2002, 04, 24, 9, 20, 16, 234, ZoneId.of("America/New_York"));
		System.out.println(time2);
		
		LocalDate randomDate = LocalDate.of(2024, 6, 20); // FIND LAST THURSDAY
		System.out.printf("The previous Thursday is: %s%n",
				randomDate.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));
		
		//get no of days in each month
		int year=2024;
		for(int month=1;month<=12;month++) {
			YearMonth ym= YearMonth.of(year, month);
			int noOfDays=ym.lengthOfMonth();
			String monthName=ym.getMonth().toString();
			System.err.println(monthName+ "has "+ noOfDays);
		}
        
	
	
	//current year, lists all of the Mondays in that month.
	 int yr=2024;
	 Month m=Month.JUNE;
	 LocalDate date=LocalDate.of(yr, m, 1);
     while(date.getMonth()== m) {
		 if(date.getDayOfWeek()==DayOfWeek.MONDAY) {
			 System.out.println(date);
		 }
		 date=date.plusDays(1);
	 }
     
     //current date and time
     LocalDateTime dateTim=LocalDateTime.now();
     System.err.println(dateTim);
     System.out.println("Before formatting: " + dateTim);
     DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

     String formattedDate = dateTim.format(myFormatObj);
     System.out.println("After formatting: " + formattedDate);
	}
}
