package com.chapter8._ach.template;

public class BuildHighEndHouse extends BuildHouseRecipe {

	@Override
	void toDeveloperState() {
		System.out.println("House builded to developer state. Roof with tiles.");
	}

	@Override
	void toCompleteState() {
		System.out.println("House builded and with interior finish.");
	}

}
