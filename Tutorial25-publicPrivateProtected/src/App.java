//What to know.
//PRIVATE is ONLY accessible in the same class, unless you make special methods
//PUBLIC is accessible litterally anywhere
//PROTECTED is accessible only in the class it is created in, sub/child classes, and classes in the same package
//NO MODIFIER

/*
 * private -- only within same class
 * public -- from anywhere
 * protected -- same class, subclass, and same package
 * no modifier -- same class, same package only	
 * Difference between protected and no modifier is that protected can be accessed in other packages because child classes can be in another package
 * if the package and class name is imported. E.g if you import World.* to a class in default package it can extend any class in World package
 */

import World.Plant;

//You usually don't want instance variables to be public because those can be
//changed by the public. If you want one, it should be static and constant

public class App {
	public static void main(String[] args) {

		Plant plant = new Plant();

		// This works because the instance variable is public
		System.out.println(plant.name);

		// Won't work. Type is private
		// System.out.println(plant.type);

		// Won't work because size is protected and app is in different package. However
		// if this class was a child class of plant this would work
		// System.out.println(plant.size);

		// Won't work because height is in different package.
		// System.out.println(plant.height);
	}
}
