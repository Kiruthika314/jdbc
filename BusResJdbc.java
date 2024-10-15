package jdbc;

import java.util.Scanner;

public class BusResJdbc {
	public static void main(String args[]) throws Exception {
		int userchoice=1;
		Scanner sc=new Scanner(System.in);
		BusDAO busdao =new BusDAO();
		
		while(userchoice==1) {
			busdao.display();
			System.out.println("Enter 1 for  Booking and 2 for Exit : ");
			userchoice=sc.nextInt();
			if(userchoice==1) {
				Booking booking =new Booking();
				if(booking.isAvailable()) {
					BookingDAO bdao=new BookingDAO();
					bdao.add(booking);
					System.out.println("Your booking is confirmed!");
				}
				else
					
					System.out.println("Sorry,All seats are booked!");
			}
			//Bus bus=new Bus();
		}
		
	sc.close();
}

}
