package com.chapter8._ach.templatewithhook;

public class BuildHighEndHouse extends ABuildHouseRecipe {

	public BuildHighEndHouse(){
		System.out.println("Build high end house");
		System.out.println("============================");
	}
	
	@Override
	void toDeveloperState() {
		System.out.println("House builded to developer state. Roof with tiles.");
	}

	@Override
	void hookBeforeCompleteState(){
		System.out.println("[HOOK] Consultation to get preferences about finising interior - before complete state.");
	}

	@Override
	void toCompleteState() {
		System.out.println("House builded and with interior finish.");
	}

}
