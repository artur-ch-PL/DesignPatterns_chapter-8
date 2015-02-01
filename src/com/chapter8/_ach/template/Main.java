package com.chapter8._ach.template;

public class Main {

	public static void main(String[] args) {
		System.out.println("============================");
		System.out.println("Build high end house");
		System.out.println("============================");
		BuildHighEndHouse house = new BuildHighEndHouse();
		house.buildHouse();

		System.out.println("============================");
		System.out.println("Build budget house");
		System.out.println("============================");
		BuildBudgetHouse bbh = new BuildBudgetHouse();
		bbh.buildHouse();
	}

}
