package com.chapter8._ach.templatewithhook;

public abstract class ABuildHouseRecipe {

	ABuildHouseRecipe(){
		System.out.println("============================");
	}
	
	final void buildHouse(){
		foundations();
		toRoughShell();
		toDeveloperState();
		hookBeforeCompleteState();
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
	
	/**
	 * In this tamplete, concrete methods that do nothing by default are called "hooks".
	 *  Sublclasses are free to override these but do not have to.
	 */
	void hookBeforeCompleteState() {};

}
