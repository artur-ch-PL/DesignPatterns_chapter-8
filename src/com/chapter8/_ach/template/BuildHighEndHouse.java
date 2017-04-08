package com.chapter8._ach.template;

public class BuildHighEndHouse extends BuildHouseRecipe {

	public BuildHighEndHouse(){
		System.out.println("============================");
		System.out.println("Build high-end house");
		System.out.println("============================");
	}
	
	@Override
	void toDeveloperState() {
		System.out.println("House builded to developer state. Roof with tiles.");
	}

	@Override
	void toCompleteState() {
		System.out.println("House builded with interior finish.");
	}

}
