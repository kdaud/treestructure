package com.openmrs.resource;


public class Inward implements BioData {
	
	static {
		System.out.println("Hello World");
	}
	
	@Override
	public void patientDetail() {
		System.out.println("From the parent class");
		
	}
	
}
