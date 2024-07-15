package com.tech.assement;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bikes {
	static Map<Integer,String> bikesSlots=new LinkedHashMap<Integer, String>();
	static Map<String,Integer> filledbikesSlots=new LinkedHashMap<>();
	public Bikes() {
		bikesSlots.put(1, "SlotNumber ");
		bikesSlots.put(2, "SlotNumber ");
		bikesSlots.put(3, "SlotNumber ");
		bikesSlots.put(4, "SlotNumber ");
		bikesSlots.put(5, "SlotNumber ");
		bikesSlots.put(6, "SlotNumber ");
		bikesSlots.put(7, "SlotNumber ");
		bikesSlots.put(8, "SlotNumber ");
		bikesSlots.put(9, "SlotNumber ");
		bikesSlots.put(10, "SlotNumber ");
	}

	public void availableSlots() {
		Iterator<Map.Entry<Integer, String>> iterator=bikesSlots.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer,String> entry = iterator.next();
			Integer key = entry.getKey();
			String value= entry.getValue();
			System.out.println(key+ " - "+value); 	
		}
	}
	public void bookingSlot(int slotNumber,String name) {
		if(bikesSlots.containsKey(slotNumber)) {
			System.out.println("Your vehicle parked successfully..!!!");
			filledbikesSlots.put(name, slotNumber);
			bikesSlots.remove(slotNumber);
		}
		else {
			System.out.println("The slot is already Booked.. Please select other ");
		}
	}
}
