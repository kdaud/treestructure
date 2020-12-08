package com.openmrs.resource;


public class Outward extends Inward {
	
	@Override
	public void patientDetail() {
		System.out.println("From Child Class");
	}
	
}
