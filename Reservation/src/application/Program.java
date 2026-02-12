package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    
	    try {
			System.out.print("Room number:");
			int number = sc.nextInt();
			System.out.print("Check-in date (DD/MM/YYYY): ");
			LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
			System.out.print("Check-out date (DD/MM/YYYY): ");
			LocalDate checkOut = LocalDate.parse(sc.next(), fmt);	
		
			Reservation res= new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: "+res);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (DD/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), fmt);
			System.out.print("Check-out date (DD/MM/YYYY): ");
		    checkOut = LocalDate.parse(sc.next(), fmt);
		    
		    res.updateDates(checkIn, checkOut);
		    System.out.println("Reservation: "+res);
	    }
	    catch(DateTimeParseException e ) {
	    	System.out.println("Invalid date format");

	    }
	    catch(DomainException e) {
	    	System.out.println("Error in reservation: "+ e.getMessage());
	    }
		
		sc.close();
	}

}
