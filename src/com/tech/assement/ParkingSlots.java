package com.tech.assement;

import java.util.Scanner;

public class ParkingSlots {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		
		Cars cars= new Cars();
		Bikes bikes = new Bikes();
		
		boolean iteration=true;
		
		while(iteration) {
			System.out.println("Hii Welocome..!!! \n If you want to continue press 1 \n For exit press 0 and \n If you want to see your parking Details press 2");
			int option= scanner.nextInt();
			if(option==0) {
				System.out.println("Thanks for visiting our parking Apartment See you soon again..!!!");
				return;
			}
			else if(option==2) {
				System.out.println(Cars.filledCarsSlots);
				System.out.println(Bikes.filledbikesSlots);
				System.out.println();
			}
			else if(option==1){
				System.out.println("Please choose your vehicle type \n Press 1 for Bikes \n Press 2 for Cars");
				int vehicleType=scanner.nextInt();
				if(vehicleType==1) {
					System.out.println("Please go to basement 1 for parking and here is the available slots from Basement 1 : ");
					bikes.availableSlots();
					System.out.println("Please enter the slot number that you want to park your vehicle : ");
					int slotNumber=scanner.nextInt();
					System.out.println("Please enter your name : ");
					String name=scanner.next();
					bikes.bookingSlot(slotNumber, name);
				}
				if(vehicleType==2) {
					System.out.println("Please go to basement 2 for parking and here is the available slots from Basement 2 : ");
					Cars.availableSlots();
					System.out.println("Please enter the slot number that you want to park your vehicle : ");
					int slotNumber=scanner.nextInt();
					System.out.println("Please enter your name : ");
					String name=scanner.next();
					cars.bookingSlot(slotNumber, name);
				}
			}
			else  {
				System.out.println("Please choose the options from the list..!!!");
			}
		}
		scanner.close();
	}
}
