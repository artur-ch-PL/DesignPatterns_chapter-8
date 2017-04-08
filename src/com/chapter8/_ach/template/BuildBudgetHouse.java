package com.chapter8._ach.template;

public class BuildBudgetHouse extends BuildHouseRecipe {
	
	public BuildBudgetHouse(){
		System.out.println("============================");
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
