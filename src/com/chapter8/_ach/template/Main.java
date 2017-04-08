package com.chapter8._ach.template;

public class Main {

	public static void main(String[] args) {
		BuildHighEndHouse house = new BuildHighEndHouse();
		house.buildHouse();

		BuildBudgetHouse buildBudgetHouse = new BuildBudgetHouse();
		buildBudgetHouse.buildHouse();
	}

}
