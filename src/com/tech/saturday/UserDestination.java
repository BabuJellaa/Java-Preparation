package com.tech.saturday;

public class UserDestination {

	public static void main(String[] args) {
		
		int givenNumber=10;
		int userNumber=10;
		
		String userCity="Hyderabad";
		String givenCity="Siddipet";
		
		if(givenNumber!=userNumber) {  // 10 != 10
			System.out.println("User not exists....!!!!");
		}
		else {
			
			if(userCity.equals(givenCity)) {
				System.out.println("He is from Hyderabad...!!!");
			}
			else {
				System.out.println("He is not from Hyderabad..!!");
			}
			
		}
		
	}
}
