package com.tech.assement;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cars {
	static Map<Integer,String> carsSlots=new LinkedHashMap<>();
	static Map<String,Integer> filledCarsSlots=new LinkedHashMap<>();
	public Cars() {
		carsSlots.put(1, "SlotNumber ");
		carsSlots.put(2, "SlotNumber ");
		carsSlots.put(3, "SlotNumber ");
		carsSlots.put(4, "SlotNumber ");
		carsSlots.put(5, "SlotNumber ");
		carsSlots.put(6, "SlotNumber ");
		carsSlots.put(7, "SlotNumber ");
		carsSlots.put(8, "SlotNumber ");
		carsSlots.put(9, "SlotNumber ");
		carsSlots.put(10, "SlotNumber ");
	}
	
	public static void availableSlots() {
		Iterator<Map.Entry<Integer,String>> iterator=carsSlots.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer,String> entry = iterator.next();
			int key = entry.getKey();
			String value= entry.getValue();
			System.out.println(key+ " - "+value);
		}
	}
	public void bookingSlot(int slotNumber,String name) {
		if(carsSlots.containsKey(slotNumber)) {
			System.out.println("Your vehicle parked successfully..!!!");
			filledCarsSlots.put(name, slotNumber);
			carsSlots.remove(slotNumber);
		}
		else {
			System.out.println("The slot is already Booked.. Please select other available slot..!!");
		}
	}
}
