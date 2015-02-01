package com.chapter8._ach.templatewithhook;

public class BuildBudgetHouse extends BuildHouseRecipe {

	@Override
	void toDeveloperState() {
		System.out.println("House completed. Roof without tiles.");
	}

	@Override
	void toCompleteState() {
		System.out.println("House completed. Rooft with tiles.");
	}

}
