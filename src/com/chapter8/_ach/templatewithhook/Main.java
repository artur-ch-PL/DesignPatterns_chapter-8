package com.chapter8._ach.templatewithhook;

public class Main {

	public static void main(String[] args) {
		ABuildHouseRecipe house = new BuildHighEndHouse();
		house.buildHouse();

		house = new BuildBudgetHouse();
		house.buildHouse();
	}

}
