package com.chapter8._ach.templatewithhook;

public class BuildBudgetHouse extends ABuildHouseRecipe {

	BuildBudgetHouse(){
		System.out.println("Build budget house");
		System.out.println("============================");
	}
	
	@Override
	void toDeveloperState() {
		System.out.println("House completed. Roof without tiles.");
	}

	@Override
	void toCompleteState() {
		System.out.println("House completed. Rooft with tiles.");
	}

}
