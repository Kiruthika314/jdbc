package jdbc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String name;
	int busNo;
	Date date;
	Booking() throws ParseException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		name=sc.next();
		System.out.println("Enter bus no. : ");
		busNo=sc.nextInt();
		System.out.println("Enter date : ");
		String d=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
			date=sdf.parse(d);
	}
		
	
	public boolean isAvailable() throws Exception {
		BusDAO busd=new BusDAO();
		BookingDAO bdo=new BookingDAO();
		int c=busd.getCapacity(busNo);
		int b=bdo.getBookedCount(busNo,date);
		return b<c;
	}

}
