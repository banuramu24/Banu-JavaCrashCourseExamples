/*
 * We see example for a 3)STATIC VARIABLES now.......
 * If we declare a variable as static then the variable is called static variable.
 * The static variable is shared among all the instances/or objects of the class.
 * Only a single copy of static variables is created and shared among all the objects of the class.
 */


package com.lao.static_keyword;

public class StaticVariables {

	/*
	 * Example to show , static variables are shared among objects.
	 */
	//Here static variable accountBalance is created once now and it is not created again.
	static int accountBalance=0;
	String depositedBy;
	
	public static void main(String[] args) {
		//To show static variable is shared amng the multiple objects,
		//we have made a reference by creating different objects.
		StaticVariables object1=new StaticVariables();
		object1.accountBalance=1000;
		//One important thing to be noted is for string varibales we can pass the values only inside the main function.
		//here object1 value is passed inside main function only.
		object1.depositedBy="Agni"; 
		
		StaticVariables object2=new StaticVariables();
		object2.accountBalance=2000;
		object2.depositedBy="Riya"; 
		
		System.out.println("Object1 Integer: " + object1.accountBalance);
		System.out.println("object1 String: " + object1.depositedBy);
		System.out.println("Object2 Integer: " + object2.accountBalance);
		System.out.println("object2 String: " + object2.depositedBy);
	}

}
 
//STATIC CLASS : We will not use at all.