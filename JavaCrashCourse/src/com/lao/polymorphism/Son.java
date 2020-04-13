//overriding example
package com.lao.polymorphism;

public class Son extends Parents{

	/*
	 * this class is to illustrate method overriding with practical example.
	 */
	@Override
	public void marriage()
	{
		System.out.println("My Marriage!My Rules!");
	}
	public static void main(String[] args) {
		
		Parents parents=new Son(); 
		parents.properties();
		parents.marriage();
	}

}
 