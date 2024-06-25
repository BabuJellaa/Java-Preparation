package com.capgemini;

class House {
    private static int totalPowerConsumption = 0;
    private static int totalFanPowerConsumption = 0;
    private static int totalLightPowerConsumption = 0;

    private int roomPowerConsumption;

    public House(int roomPowerConsumption) {
        this.roomPowerConsumption = roomPowerConsumption;
    }

    public void controlLights() {
        totalLightPowerConsumption += roomPowerConsumption;
        totalPowerConsumption += roomPowerConsumption;
    }

    public void controlFans() {
        totalFanPowerConsumption += roomPowerConsumption;
        totalPowerConsumption += roomPowerConsumption;
    }

    public static int getTotalPowerConsumption() {
        return totalPowerConsumption;
    }

    public static int getTotalFanPowerConsumption() {
        return totalFanPowerConsumption;
    }

    public static int getTotalLightPowerConsumption() {
        return totalLightPowerConsumption;
    }
}

public class AjayDurgam {
    public static void main(String[] args) {
        House myRoom = new House(150); 

        myRoom.controlLights();
        myRoom.controlFans();
       
        System.out.println("Total Power Consumption: " + House.getTotalPowerConsumption() + " watts");
        System.out.println("Total Fan Power Consumption: " + House.getTotalFanPowerConsumption() + " watts");
        System.out.println("Total Light Power Consumption: " + House.getTotalLightPowerConsumption() + " watts");
    }
}
