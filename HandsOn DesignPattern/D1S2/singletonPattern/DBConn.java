package com.cognizant.designPrinciples.singletonPattern;

public class DBConn {
	
	 //create an object of SingleObject
	private static DBConn instance=new DBConn();
	
	//make the constructor private so that this class cannot be
   //instantiated
	private DBConn() {		
	}
	
	//Get the only object available
	static DBConn getInstance() {
		return instance;
	}
	

	//caller method implementation
	public void caller() {
		System.out.println(DBConn.getInstance());
	}
	
	//main method to get instance of singleton class and call caller method
	public static void main(String[] args) {
		DBConn object=DBConn.getInstance();
		object.caller();
	}
}
