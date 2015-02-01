package com.chapter8._ach.templatewithhook;

public class Main {

	public static void main(String[] args) {
		System.out.println("============================");
		System.out.println("Build high end house");
		System.out.println("============================");
		BuildHouseRecipe house = new BuildHighEndHouse();
		house.buildHouse();

		System.out.println("============================");
		System.out.println("Build budget house");
		System.out.println("============================");
		house = new BuildBudgetHouse();
		house.buildHouse();
	}

}
