//Example for abstraction.
//Hiding the implementation details is called abstraction.
//How to achieve? We can either use abstract class or Interface.
//We cannot create object for abstract class.
//Abstraction can have implemented methods.
//ABSTRACT CLASS(0 to 100%) -> 50% abstraction.

package com.lao.abstraction;

public abstract class Car {
public abstract void engineSecret();
//Removed Implementation
//{
//	System.out.println("Car's Engine Secret");
//}
public abstract void CompanyVault();
//Removed Implementation
//{
//  System.out.println("Car's Company Vault");
//}
public abstract void method2();
public abstract void method3();
public void employees() {
	/*
	 * this method is to illustrate partial abstraction can be present.
	 */
	System.out.println("Employees");
	
}

}