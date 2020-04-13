//Inheritance(Access Modifiers):
/*
 * It's the concept of reusability.
 * process of acquiring the properties(datas and methods) by another class.
 * The one which takes - child class
 * The one which gives - parent class
 * How to inherit ? Using extends keyword.
 * A child can be a parent of another class.
 * A parent can be a child of another class.
 * Inheritance is also called IS-A relationship.
 */

//*PARENT CLASS - CAR// Dont create main function.
package com.lao.inheritance;

public class Car {
     //below is the example for default access modifier. so it is public by default.
	 int wheels = 4;
	 void engine()
	{
		System.out.println("This is my engine secret");
	}
	
}
  