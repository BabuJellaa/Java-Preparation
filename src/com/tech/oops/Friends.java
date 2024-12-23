package com.tech.oops;

import com.tech.oops.Friends.Venky;

public class Friends {
	// Protected nested class
	protected class Venky {
		public Venky() {}
		public void doCoding() {
			System.out.println("Coding..!!!");
		}
	}
	protected void protectedMethod() {
		System.out.println("This is Protected method..!!");
	}
	public void publicMethod() {
		System.out.println("This is Public method..!!");
	}

	public void FriendsWithBenefits() {
		Venky venky = new Venky();
		venky.doCoding();
	}
}
