package com.chapter8._ach.template;

public abstract class BuildHouseRecipe {
	final void buildHouse(){
		foundations();
		toRoughShell();
		toDeveloperState();
		toCompleteState();
	}
	
	private void foundations() {
		System.out.println("Foundations are done...");
	}

	private void toRoughShell() {
		System.out.println("Rough shell with windows and doors...");
	}

	abstract void toDeveloperState();

	abstract void toCompleteState();
}
