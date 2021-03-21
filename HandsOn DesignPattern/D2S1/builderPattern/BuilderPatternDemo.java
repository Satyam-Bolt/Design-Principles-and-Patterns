package com.cognizant.designPrinciples.builderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonvegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\nNonVeg Meal");
		nonvegMeal.showItems();
		System.out.println("Total Cost: " + nonvegMeal.getCost());
	}
	
}
