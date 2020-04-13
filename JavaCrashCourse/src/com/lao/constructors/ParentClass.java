//Example for Super Keyword.
//It is mainly used in inheritance.lets create Parent and Child Class.
//without creating any main method.. child class can acquire the properties 
//of a parentclass. 
//[This] keyword when is used?
//when we have parent child relationship with same variables.
//for eg: animal_name , animal_type variables for both parent and child class.
//that tym we use this.animal_name = name;
//this.animal_type = type;
//which means it will assign values for that particular class.


package com.lao.constructors;

public class ParentClass {
	
	//now declare a no arg constructor
	public ParentClass() {
		System.out.println("Parent Class Constructor");
	}

}
