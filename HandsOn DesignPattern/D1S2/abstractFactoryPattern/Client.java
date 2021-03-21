package com.cognizant.designPrinciples.abstractFactoryPattern;


public class Client {
	
	public static void main(String[] args) {
		
	Factory fact1=new MercedesFactory();
	Headlight mhl = fact1.makeHeadlight();
	mhl.headlightProduced("Mercedes");
	Tire mt = fact1.makeTire();
	mt.tireProduced("Mercedes");
	
	Factory fact2=new AudiFactory();
	Headlight ahl = fact2.makeHeadlight();
	ahl.headlightProduced("Audi");
	Tire at = fact1.makeTire();
	at.tireProduced("Audi");
	
	}
	 
}
