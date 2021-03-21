package com.cognizant.designPrinciples.abstractFactoryPattern;

public class AudiHeadlight extends Headlight {

	public void headlightProduced(String type) {
		System.out.println(type+ " headlight produced");
	}

}
