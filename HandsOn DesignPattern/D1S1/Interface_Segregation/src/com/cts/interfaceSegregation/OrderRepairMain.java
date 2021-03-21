package com.cts.interfaceSegregation;
import java.util.Scanner;

public class OrderRepairMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to repair or order?");
		String processOption=sc.nextLine().toLowerCase().trim();
		OrderRepair orderrepair=new OrderRepair();
		String productDetail="";
		
		switch(processOption) {
			case "order":
				System.out.println("Please provide the phone model name");
				productDetail=sc.nextLine().trim();
				orderrepair.processOrder(productDetail);
				break;
				
			case "repair":
				System.out.println("Is it the phone or the accessory that you want to be repaired?");
				String productType=sc.nextLine().toLowerCase();
				if(productType.equals("phone")) {
					System.out.println("Please provide the phone model name");
					productDetail=sc.nextLine().trim();
					orderrepair.processPhoneRepair(productDetail);				
				}
				else {
					System.out.println("Please provide the accessory detail, like headphone, tempered glass");
					productDetail=sc.nextLine().trim();
					orderrepair.processAccessoryRepair(productDetail);				
				}
				break;
			default:
				break;
		}
		sc.close();
	}

}
