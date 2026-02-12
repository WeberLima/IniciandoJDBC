package application;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;


public class ex2{

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);
     
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1= LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2= LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3= LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r4= LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDate lastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDate nextYearLocalDate = d04.plusYears(1);

        
        System.out.println("r1="+r1);
        System.out.println("r2="+r2);
        System.out.println("r3="+r3);
        System.out.println("r4="+r4);
        System.out.println("d04 dia="+d04.getDayOfMonth());
        System.out.println("d04 dia="+d04.getMonthValue());
        System.out.println("lastWeekLocalDate ="+lastWeekLocalDate );
        System.out.println("nextWeekLocalDate ="+nextWeekLocalDate );
        System.out.println("nextYearLocalDate ="+nextYearLocalDate );

        Instant lastWeekInstant= d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant= d06.plus(7, ChronoUnit.DAYS);
        System.out.println("lastWeekInstant ="+lastWeekInstant );
        System.out.println("nextWeekInstant ="+nextWeekInstant );
        
        Duration t1= Duration.between(lastWeekInstant, nextWeekInstant);
        Duration t2= Duration.between(lastWeekLocalDate.atStartOfDay() , d04.atTime(0, 0));

        System.out.println("t1 horas = "+ t1.toHours());
	}
	
	
	
	

}
