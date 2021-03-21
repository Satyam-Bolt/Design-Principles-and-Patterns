package com.cts.singleresponsibilityprinciple;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to repair or order?");
		String processOption=sc.nextLine().toLowerCase().trim();
		ProcessOrderImpl order=new ProcessOrderImpl ();
		ProcessRepairImpl repair=new ProcessRepairImpl();
		String productDetail="";
		
		switch(processOption) {
			case "order":
				System.out.println("Please provide the phone model name");
				productDetail=sc.nextLine().trim();
				order.processOrder(productDetail);
				break;
				
			case "repair":
				System.out.println("Is it the phone or the accessory that you want to be repaired?");
				String productType=sc.nextLine().toLowerCase();
				if(productType.equals("phone")) {
					System.out.println("Please provide the phone model name");
					productDetail=sc.nextLine().trim();
					repair.processPhoneRepair(productDetail);				
				}
				else {
					System.out.println("Please provide the accessory detail, like headphone, tempered glass");
					productDetail=sc.nextLine().trim();
					repair.processAccessoryRepair(productDetail);				
				}
				break;
			default:
				break;
		}
		sc.close();
	}

}

	
