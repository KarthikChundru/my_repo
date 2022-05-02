package com.java8.test;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;


public class Date{
	public static void main(String[] args) {
		
    LocalDate ld = LocalDate.now();
    LocalDate after_15_days = ld.plusDays(15);
    System.out.println(after_15_days);
    
    LocalTime lt = LocalTime.of(12, 0);
    LocalTime lt_2 = LocalTime.now();
    Duration Dur = Duration.between(lt, lt_2);
    System.out.println(Dur.getSeconds());
    
    
    LocalDate lc1 = LocalDate.now();
    Duration Dur3 = Duration.ofDays(29);
    System.out.println(Dur3);
    
    Period per = Period.between(ld, ld);
    ZoneId usa = ZoneId.of("America/Indiana/Winamac");
    LocalTime local_time_usa = LocalTime.now();
    System.out.println(local_time_usa);
    
    
    LocalDateTime now = LocalDateTime.now();
    ZonedDateTime chicago = now.atZone(ZoneId.of("America/New_York"));
    System.out.println("chicago: " + chicago);
    
    
    LocalDate lc6 = LocalDate.now();
    System.out.println(lc6);
    LocalDateTime ldt6 = LocalDateTime.now();
    System.out.println(ldt6);
    
    
    Year y = Year.now();
    System.out.println(y);
    
     Year y1 = Year.now();
     System.out.println(y1);
     Scanner sc = new Scanner(System.in);
     int year = sc.nextInt(); //int year = 2022;
     boolean leap = true;
     if(year%4 == 0) {
     if(year%100 == 0) {
     if(year%400 == 0) {
     leap = true;
     
}
    else {
    leap = false;
    
   }
}
     else {
     leap = false;
     
  }
} 
     else {
     leap = false;
}
     if(leap)
     System.out.println("No of Sundays=53");
     else
     System.out.println("No of Sundays=52");
     }
	
}

